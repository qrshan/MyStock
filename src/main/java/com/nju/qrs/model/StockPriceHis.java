package com.nju.qrs.model;

public class StockPriceHis {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_price_his.stockNum
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    private String stockNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_price_his.date
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    private String date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_price_his.price
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_price_his.volume
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    private Long volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_price_his.time
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    private String time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_price_his.stockNum
     *
     * @return the value of stock_price_his.stockNum
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_price_his.stockNum
     *
     * @param stockNum the value for stock_price_his.stockNum
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_price_his.date
     *
     * @return the value of stock_price_his.date
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_price_his.date
     *
     * @param date the value for stock_price_his.date
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_price_his.price
     *
     * @return the value of stock_price_his.price
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_price_his.price
     *
     * @param price the value for stock_price_his.price
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_price_his.volume
     *
     * @return the value of stock_price_his.volume
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public Long getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_price_his.volume
     *
     * @param volume the value for stock_price_his.volume
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public void setVolume(Long volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_price_his.time
     *
     * @return the value of stock_price_his.time
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_price_his.time
     *
     * @param time the value for stock_price_his.time
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}