<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/loginAction" method="post">
		username:<input type="text" name="username"> <br>
		password:<input type="password" name="password"> <br> <input
			type="submit" value="提交">
	</form>
	<h1>anther mode</h1>
	<form action="<%=request.getContextPath()%>/mloginAction" method="post">
		username:<input type="text" name="username"> <br>
		password:<input type="password" name="password"> <br> <input
			type="submit" value="提交">
	</form>
	<h1>anther smode</h1>
	<s:form namespace="userlogin" action="sloginAction" method="post">
	username:<s:textfield name="us.username"></s:textfield>
		<br>
	password:<s:password name="us.password">
		</s:password>
		<br>
		<s:submit value="提交" />
	</s:form>
</body>
</html>