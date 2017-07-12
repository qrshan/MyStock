<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin页面</title>
</head>
<body>
Dear <strong>${user}</strong>, Welcome to admin页面.<br/>
<a href="<c:url value="/logout" />">Logout</a><br/>
<a href="<c:url value="/newuser" />">创建新用户</a><br/>
</body>
</html>