package com.nju.qrs.controller;

import com.nju.qrs.model.Stock;
import com.nju.qrs.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by qingrongshan on 17/4/14.
 */
@Controller
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping("stockList")
    public ModelAndView stockList() {
        String[] stocks = stockService.showAllStocksInCache();
        Map<String, String> stockPriceMap = stockService.allStockPricesInCache();
        ModelAndView mv =new ModelAndView("stocklist");
        mv.addObject("stockSize", stocks.length);
        mv.addObject("stockList", stocks);
        mv.addObject("stockPrice", stockPriceMap);
        return mv;
    }
}
