package com.nju.qrs.service;

import java.util.Map;

/**
 * Created by qingrongshan on 17/4/11.
 */
public interface StockService {
    public void requestStocks(String[] stockNums);

    public void searchStock(String stockNum);

    public String[] showAllStocksInCache();

    public Map<String, String> allStockPricesInCache();

    public void showAllStocks();
}
