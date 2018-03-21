<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import = "java.net.URLDecoder" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cook 登录</title>
</head>
<body>
<% 
/*
try{
	int m=10;
	int n=0;
	request.setAttribute("result",m/n);
}catch (Exception e){
	request.setAttribute("result","sorry ,page err!");
}
*/
%>
  
<!--jsp:forward page="deal.jsp"/-->
<% 
	Cookie[] cookies = request.getCookies();
	String user = "";
	String date1 = "";
	if(cookies != null){
		for(int i=0 ; i<cookies.length;i++){
			if(cookies[i].getName().equals("mrCookie")){
				//user = URLDecoder.decode(cookies[i].getValue().split("#")[0]);
				user = (cookies[i].getValue().split("#")[0]);
				date1 = cookies[i].getValue().split("#")[1];
			}
		}
	}
	if("".equals(user) && "".equals(date1)){
%>
	游客您好，欢迎初次光临,test github 哈哈哈哈哈！
	<form action="deal.jsp" method = "post">
		姓名：<input name="user" type="text" value="">
		<input type="submit" value="确定">
	</form>	
<%
	}else{
%>		
	欢迎 <b> <%=user %> </b>再次光临！<br>
<% 
	}
%>	
	
</body>
</html>
