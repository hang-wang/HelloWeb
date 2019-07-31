<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/servlet/LoginServlet" method="post">
	username:<input type="text" name="username"> <br>
	password:<input type="password"name="password"> <br>
	<input type="submit" value="提交">
</form>
</body>
</html>