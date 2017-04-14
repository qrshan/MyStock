<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qingrongshan
  Date: 17/4/14
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StockList</title>
</head>
<body>
<h2>当前股票数量:${requestScope.stockSize}</h2>
<table border="1">
    <tr>
        <td>stockNum</td>
        <td>stockPrice</td>
    </tr>
    <c:forEach items="${requestScope.stockList}" var="stock">
        <tr>
            <c:set value="${requestScope.stockPrice}" var="map"/>
            <td>${stock}</td>
            <td>${map.get(stock)}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
