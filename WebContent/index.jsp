<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import = "java.net.URLDecoder" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>cook ��¼</title>
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
	�ο����ã���ӭ���ι��٣�
	<form action="deal.jsp" method = "post">
		������<input name="user" type="text" value="">
		<input type="submit" value="ȷ��">
	</form>	
<%
	}else{
%>		
	��ӭ <b> <%=user %> </b>�ٴι��٣�<br>
<% 
	}
%>	
	
</body>
</html>