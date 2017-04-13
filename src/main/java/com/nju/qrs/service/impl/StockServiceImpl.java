package com.nju.qrs.service.impl;

import com.nju.qrs.beanhandler.StockBeanHandler;
import com.nju.qrs.dao.StockDao;
import com.nju.qrs.dao.StockRedisDao;
import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockPrice;
import com.nju.qrs.service.StockService;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StockServiceImpl implements StockService {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

    private static final String APP_KEY = "47ebc31bdeda7fbd279c1afe750537dc";
    private StockBeanHandler stockBeanHandler;

    private StockRedisDao stockRedisDao;
    private StockDao stockDao;

    @Override
    public void requestStocks(String[] stockNums) {
        for (String stockNum : stockNums) {
            requestStock(stockNum);
        }
    }

    @Override
    public void searchStock(String stockNum) {
        Stock stock = stockDao.getStockByNum(stockNum);
        if (stock != null) {

        }
    }

    @Override
    public void showAllStocks() {
        Set<String> stocks = stockRedisDao.allStockList();
        Map<String, String> stockPrices = (Map<String, String>) stockRedisDao.allStockPrice();
        for (String stock : stocks) {
            System.out.println(stock + "-->" + stockPrices.get(stock));
        }
    }

    private void requestStock(String stockNum) {
        String result = null;
        String url = "http://op.juhe.cn/onebox/stock/query";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("key", APP_KEY);//应用APPKEY(应用详细页查询)
        params.put("dtype", "");//返回数据的格式,xml或json，默认json
        params.put("stock", stockNum);//股票名称

        try {
            result = request(url, params, "GET");
            Stock stock = stockBeanHandler.parseJsonStockResult(result, stockNum);
            List<StockPrice> stockPriceList = stockBeanHandler.parseJsonStockPriceListResult(result, stockNum);
            stockRedisDao.setStockData(stock);
            stockDao.insert(stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return 网络请求字符串
     * @throws Exception
     */
    public static String request(String strUrl, Map params, String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if (method == null || method.equals("GET")) {
                strUrl = strUrl + "?" + urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if (method == null || method.equals("GET")) {
                conn.setRequestMethod("GET");
            } else {
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params != null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }

    //将map型转为请求参数型
    public static String urlencode(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public void setStockBeanHandler(StockBeanHandler stockBeanHandler) {
        this.stockBeanHandler = stockBeanHandler;
    }

    public void setStockRedisDao(StockRedisDao stockRedisDao) {
        this.stockRedisDao = stockRedisDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
