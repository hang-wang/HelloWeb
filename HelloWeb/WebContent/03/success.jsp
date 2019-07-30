<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功提示界面</title>
<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}

#message {
	text-align: center;
}
</style>
</head>
<body>
	<div id="message">
		登录成功。<br /> 你提交的信息为:<br /> 用户名：<%=request.getParameter("uname")%><br />
		密码:<%=request.getParameter("upwd")%><br /> <a href="<%=request.getContextPath() %>/03/login.jsp">返回登录界面</a>
	</div>
</body>
</html>