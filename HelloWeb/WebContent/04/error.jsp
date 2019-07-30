<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆失败提示界面</title>
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
		登录失败。<br /> 错误提示：
		<%
		Object obj = request.getAttribute("msg");
		if (obj != null) {
			out.println(obj.toString());
		} else {
			out.println("无");
		}
	%>
		<br /> 你提交的信息为:<br /> 用户名：<%=request.getParameter("uname")%><br />
		密码:<%=request.getParameter("upwd")%><br /> <a href="<%=request.getContextPath() %>/04/login.jsp">返回登录界面</a>
	</div>
</body>
</html>