<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/loginServlet" method="get">
userName:<input type="text" name="uname"/><br/>
password:<input type="password" name="upwd"/><br/>
<input type="submit" value="Login">
</form>
</body>
</html>