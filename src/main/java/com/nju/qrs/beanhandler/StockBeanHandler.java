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

    private StockDecoder stockDecoder;

    public Stock parseJsonStockResult(String result, String stockNum) {
        Stock stock = null;
        try {
            stock = stockDecoder.parseStock(result, stockNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stock;
    }

    public List<StockPrice> parseJsonStockPriceListResult(String result, String stockNum) {
        List<StockPrice> stockPriceList = stockDecoder.parseStockPrices(result);
        for (StockPrice stockPrice : stockPriceList) {
            stockPrice.setStockNum(stockNum);
        }
        return stockPriceList;
    }

    public void setStockDecoder(StockDecoder stockDecoder) {
        this.stockDecoder = stockDecoder;
    }
}
