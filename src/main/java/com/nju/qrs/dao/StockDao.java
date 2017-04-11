package com.nju.qrs.dao;

import com.nju.qrs.model.Stock;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by qingrongshan on 17/4/11.
 */
@Repository
public class StockDao {
    private static final String STOCK_LIST = "stock_list";

    @Resource
    private StringRedisTemplate redisTemplate;

    public StockDao(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void getStockData(String stockNum) {

    }

    public void setStockData(Stock stock) {
        System.out.println(stock.getStockNum() + ":" + stock.getCurrentPrice());
    }
}
