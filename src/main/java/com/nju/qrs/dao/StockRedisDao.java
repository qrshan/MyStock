package com.nju.qrs.dao;

import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockPrice;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by qingrongshan on 17/4/11.
 */
@Repository
public class StockRedisDao {
    private static final String STOCK_LIST = "stock_list";

    @Resource
    private StringRedisTemplate redisTemplate;

    public StockRedisDao(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void getStockData(String stockNum) {

    }

    public void setStockData(Stock stock) {
        System.out.println(stock.getStockNum() + ":" + stock.getStockName() + ":" + stock.getCurrentPrice());
    }

    public void setStockPrice(StockPrice stockPrice) {
        System.out.println(stockPrice.getStockNum() + ":" + stockPrice.getDate() + " " + stockPrice.getTime() + " :" + stockPrice.getPrice());
    }
}
