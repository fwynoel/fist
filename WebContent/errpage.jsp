<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>errpage</title>
</head>
<body>
用户名或者密码错误！
<%
	session.invalidate();
//	response.setHeader("refresh", "5;URL=index.jsp");
%>
已经退出,<a href="index.jsp">重新登录</a>

</body>
</html>