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

CREATE TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));

CREATE TABLE persistent_logins (
    username varchar(64) not null,
    series varchar(64) not null,
    token varchar(64) not null,
    last_used timestamp not null,
    PRIMARY KEY (series)
);

INSERT INTO users(username,password,enabled)
VALUES ('qrs','123', true);

INSERT INTO user_roles (username, role)
VALUES ('qrs', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('qrs', 'ROLE_ADMIN');