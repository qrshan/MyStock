package com.nju.qrs.decoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockPrice;
import com.nju.qrs.util.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingrongshan on 17/4/11.
 */
@Component("stockDecoder")
public class StockDecoder {

    public Stock parseStock(String result, String stockNum) throws Exception {
        Stock stock = new Stock();
        JSONObject jsonObject = JSON.parseObject(result);
        if (jsonObject.getInteger("error_code") == 0) {
            JSONObject resultObject = JSON.parseObject(jsonObject.get("result").toString());
            //System.out.println(jsonObject.get("result").toString());
            stock.setStockNum(stockNum);
            stock.setStockName(resultObject.getString("stockName"));
            //stock.setMarketClosed(resultObject.getInteger("marketClosed") == 1);
            stock.setCurrentPrice(resultObject.getFloat("currentPrice"));
            stock.setChangeAmount(resultObject.getFloat("changeAmount"));
            String priceChangeRatio = resultObject.getString("priceChangeRatio").trim();
            double changeRatio = Double.parseDouble(priceChangeRatio.substring(1, priceChangeRatio.length() - 2)) / 100;
            stock.setPriceChangeRatio(priceChangeRatio.charAt(0) == '-' ? 0 - changeRatio : changeRatio);
            stock.setBeijingTime(resultObject.getString("beijingTime"));
            stock.setCurrentTime(resultObject.getString("currenttime"));
            stock.setOpen(resultObject.getFloat("open"));
            stock.setClose(resultObject.getFloat("close"));
            stock.setMaxPrice(resultObject.getFloat("maxPrice"));
            stock.setMinPrice(resultObject.getFloat("minPrice"));
            stock.setVolume(StringUtils.parseLong(resultObject.getString("volume").trim()));
            stock.setMarketCapitalization(StringUtils.parseLong(resultObject.getString("marketCapitalization").trim()));
        } else {
            throw new Exception(jsonObject.getInteger("error_code") + ":" + jsonObject.getString("reason"));
        }
        return stock;
    }

    public List<StockPrice> parseStockPrices(String result) {
        JSONObject jsonObject = JSON.parseObject(result);
        List<StockPrice> stockPriceList = new ArrayList<StockPrice>();
        if (jsonObject.getInteger("error_code") == 0) {
            JSONObject resultObject = JSON.parseObject(jsonObject.get("result").toString());
            String priceList = resultObject.getJSONObject("timeChart").getString("p");
            stockPriceList = JSON.parseArray(priceList, StockPrice.class);
        }
        return stockPriceList;
    }
}
