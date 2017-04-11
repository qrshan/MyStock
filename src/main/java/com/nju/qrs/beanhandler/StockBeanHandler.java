package com.nju.qrs.beanhandler;

import com.nju.qrs.dao.StockDao;
import com.nju.qrs.decoder.StockDecoder;
import com.nju.qrs.model.Stock;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StockBeanHandler {

    private StockDao stockDao;

    private StockDecoder stockDecoder;

    public StockBeanHandler(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void parseJsonResult(String result) {
        Stock stock = null;
        try {
            stock = stockDecoder.parseStock(result);
            stockDao.setStockData(stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setStockDecoder(StockDecoder stockDecoder) {
        this.stockDecoder = stockDecoder;
    }
}
