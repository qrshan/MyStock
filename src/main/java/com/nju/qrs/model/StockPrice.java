package com.nju.qrs.model;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StockPrice {
    private String stockNum;
    private String date;
    private float price;
    private String rise;
    private int volume;
    private String time;

    public StockPrice() {}

    public StockPrice(String date, float price, String rise, int volume, String time) {
        this.date = date;
        this.price = price;
        this.rise = rise;
        this.volume = volume;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }
}
