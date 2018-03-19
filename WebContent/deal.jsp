<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>写入cookie</title>
</head>
<body>
<% 
	String user = request.getParameter("user");
	Cookie cookie = new Cookie("mrCookie",user+"#"+new java.util.Date().toLocaleString());	
	cookie.setMaxAge(60);
	response.addCookie(cookie);
%>
<script type="text/javascript">windows.location.href="index.jsp"</script>
</body>
</html>