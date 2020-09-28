<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="login" type="mybean.Login" scope="session"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>登录成功</title>
</head>
<BODY bgcolor=pink>
<CENTER>
<Font size=6 color=blue>
<BR><jsp:getProperty  name="login" property="backNews"/>
</Font>
<Font size=6 color=cyan>
<% if(login.isSuccess()==true) {
%>	<BR>登录名称:<jsp:getProperty name="login" property="logname"/>
<% } else { 
%>	
	<BR>登录名称:<jsp:getProperty name="login" property="logname"/>
	<BR>登陆密码:<jsp:getProperty name="login" property="password"/><%}
%>
</Font>
</CENTER>
</BODY>
</html>