package com.nju.qrs.beanhandler;

import com.nju.qrs.dao.StockDao;
import com.nju.qrs.dao.StockRedisDao;
import com.nju.qrs.decoder.StockDecoder;
import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockPrice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StockBeanHandler {

    private StockRedisDao stockRedisDao;
    @Autowired
    private StockDao stockDao;

    private StockDecoder stockDecoder;

    public StockBeanHandler(StockRedisDao stockRedisDao) {
        this.stockRedisDao = stockRedisDao;
    }

    public void parseJsonResult(String result, String stockNum) {
        Stock stock = null;
        try {
            stock = stockDecoder.parseStock(result, stockNum);
            stockRedisDao.setStockData(stock);
            stockDao.insert(stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<StockPrice> stockPriceList = stockDecoder.parseStockPrices(result);
        for (StockPrice stockPrice : stockPriceList) {
            stockPrice.setStockNum(stockNum);
            //stockRedisDao.setStockPrice(stockPrice);
        }
    }

    public void setStockDecoder(StockDecoder stockDecoder) {
        this.stockDecoder = stockDecoder;
    }
}
