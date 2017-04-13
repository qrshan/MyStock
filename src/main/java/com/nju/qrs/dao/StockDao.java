package com.nju.qrs.dao;

import com.nju.qrs.mapper.StockMapper;
import com.nju.qrs.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qingrongshan on 17/4/12.
 */
public class StockDao {

    @Autowired
    private StockMapper stockMapper;

    public void insert(Stock stock) {
        stockMapper.insertSelective(stock);
    }
}
