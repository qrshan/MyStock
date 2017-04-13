create database my_stock;
CREATE TABLE `my_stock`.`stock` (
  `stockNum` VARCHAR(10) NOT NULL,
  `stockName` VARCHAR(100) NULL,
  `marketClosed` TINYINT(1) NULL DEFAULT 0,
  `currentPrice` FLOAT(5,2) NOT NULL DEFAULT 0.00,
  `changeAmount` FLOAT(5,2) NULL DEFAULT 0.00,
  `priceChangeRatio` DOUBLE NULL DEFAULT 0.00,
  `beijingTime` VARCHAR(20) NULL,
  `currentTime` VARCHAR(20) NULL,
  `open` FLOAT(5,2) NULL DEFAULT 0.00,
  `close` FLOAT(5,2) NULL DEFAULT 0.00,
  `maxPrice` FLOAT(5,2) NULL DEFAULT 0.00,
  `minPrice` FLOAT(5,2) NULL DEFAULT 0.00,
  `volume` BIGINT(20) NULL DEFAULT 0,
  `marketCapitalization` BIGINT(20) NULL DEFAULT 0,
  PRIMARY KEY (`stockNum`))DEFAULT CHARSET=utf8;
CREATE TABLE `my_stock`.`stock_price_his` (
  `stockNum` VARCHAR(20) NOT NULL,
  `date` VARCHAR(25) NULL,
  `price` FLOAT(5,2) NOT NULL DEFAULT 0.00,
  `volume` BIGINT(20) NULL DEFAULT 0,
  `time` VARCHAR(25) NULL)DEFAULT CHARSET=utf8;