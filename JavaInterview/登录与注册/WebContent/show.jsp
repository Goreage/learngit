<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <<jsp:useBean id="register" type="mybean.Register" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>注册成功</title>
</head>
<table>
	<td><A href="register.jsp"><font size=2>用户注册</font></A>
	<td><A href="login.jsp"><font size=2>用户登录</font></A>
</table>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>注册成功</title>
</head>
<BODY bgcolor=yellow>
<CENTER>
	<Font size=4 color=blue>
		<BR><jsp:getProperty name="register" property="backNews"/>
	</Font>
<table>
	<tr><td>注册的名称:</td>
		<td><jsp:getProperty name="register" property="logname"/></td>
	</tr>
	<tr><td>注册的电子邮件:</td>
		<td><jsp:getProperty name="register" property="email"/></td>
	</tr>
</table>
</BODY>
</html>