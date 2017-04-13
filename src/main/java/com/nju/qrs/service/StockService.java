package com.nju.qrs.service;

/**
 * Created by qingrongshan on 17/4/11.
 */
public interface StockService {
    public void requestStocks(String[] stockNums);

    public void searchStock(String stockNum);

    public void showAllStocks();
}
