package com.nju.qrs.mapper;

import com.nju.qrs.model.Stock;
import com.nju.qrs.model.StockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int countByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int deleteByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int deleteByPrimaryKey(String stocknum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int insert(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int insertSelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    List<Stock> selectByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    Stock selectByPrimaryKey(String stocknum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed Apr 12 19:45:01 CST 2017
     */
    int updateByPrimaryKey(Stock record);
}