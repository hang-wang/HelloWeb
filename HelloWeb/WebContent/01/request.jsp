<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form action="" method="post">
<input typr="text" name="userName"/>
<input type="submit" value="提交"/>

</form>
请求的方法名：<%= request.getMethod() %><br/>
请求的资源：<%= request.getRequestURI() %><br/>
请求使用的协议:<%= request.getProtocol() %><br/>

<body>

</body>
</html>