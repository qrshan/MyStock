package com.nju.qrs.dao;

import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockPrice;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by qingrongshan on 17/4/11.
 */
@Repository
public class StockRedisDao {
    private static final String STOCK_LIST = "stock_list";
    private static final String STOCK_PRICE_LIST = "stock_price_list";

    @Resource
    private StringRedisTemplate redisTemplate;

    public StockRedisDao(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public Map<?, ?> allStockPrice() {
        Map<Object, Object> priceHashMap = redisTemplate.opsForHash().entries(STOCK_PRICE_LIST);
        return priceHashMap;
    }

    public Set<String> allStockList() {
        return redisTemplate.opsForSet().members(STOCK_LIST);
    }

    public void setStockData(Stock stock) {
        //System.out.println(stock.getStockNum() + ":" + stock.getStockName() + ":" + stock.getCurrentPrice());
        redisTemplate.opsForSet().add(STOCK_LIST, stock.getStockNum());
        redisTemplate.opsForHash().put(STOCK_PRICE_LIST, stock.getStockNum(), stock.getCurrentPrice() + "");
    }

    public void setStockPrice(StockPrice stockPrice) {
        System.out.println(stockPrice.getStockNum() + ":" + stockPrice.getDate() + " " + stockPrice.getTime() + " :" + stockPrice.getPrice());
    }
}
