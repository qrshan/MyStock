package com.nju.qrs.model;

import java.util.List;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class Stock {
    private String stockNum;
    private boolean marketClosed;
    private float currentPrice;
    private float changeAmount;
    private float priceChangeRatio;
    private String beijingTime;
    private String currentTime;
    private float open;
    private float close;
    private float maxPrice;
    private float minPrice;
    private long volume;
    private long marketCapitalization;
    private List<StockPrice> stockPriceList;

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public boolean isMarketClosed() {
        return marketClosed;
    }

    public void setMarketClosed(boolean marketClosed) {
        this.marketClosed = marketClosed;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(float changeAmount) {
        this.changeAmount = changeAmount;
    }

    public float getPriceChangeRatio() {
        return priceChangeRatio;
    }

    public void setPriceChangeRatio(float priceChangeRatio) {
        this.priceChangeRatio = priceChangeRatio;
    }

    public String getBeijingTime() {
        return beijingTime;
    }

    public void setBeijingTime(String beijingTime) {
        this.beijingTime = beijingTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(long marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public List<StockPrice> getStockPriceList() {
        return stockPriceList;
    }

    public void setStockPriceList(List<StockPrice> stockPriceList) {
        this.stockPriceList = stockPriceList;
    }
}
