<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆失败提示界面</title>
</head>
<body>
登录失败。<br/>
你提交的信息为:<br/>
用户名：<%= request.getParameter("uname") %><br/>
密码:<%=request.getParameter("upwd")%><br/>
<a href="02/Login.jsp">返回登录界面</a>
</body>
</html>