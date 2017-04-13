package com.nju.qrs;

import com.nju.qrs.service.StockService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StockTest {
    private static String[] stocks = {"LC"};

    public static void main(String[] args) {
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext-test.xml");
        StockService stockService = (StockService) xmlApplicationContext.getBean("stockService");
        stockService.requestStocks(stocks);
    }
}
