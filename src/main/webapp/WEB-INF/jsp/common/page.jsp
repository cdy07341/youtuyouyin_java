<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 分页功能 start -->
	<div align="center">
		<font size="2">共 ${objPage.getPages()} 页</font> <font size="2">第
			${objPage.getPageNum()} 页</font> <a href="?page=1">首页</a>
		<c:choose>
			<c:when test="${objPage.getPageNum() - 1 > 0}">
				<a href="?page=${objPage.getPageNum() - 1}">上一页</a>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${objPage.getPageNum() < objPage.getPages()}">
				<a href="?page=${objPage.getPageNum() + 1}">下一页</a>
			</c:when>
		</c:choose>
		<a href="?page=${objPage.getPages()}">尾页</a>
	</div>
	<!-- 分页功能 End -->
</body>
</html>