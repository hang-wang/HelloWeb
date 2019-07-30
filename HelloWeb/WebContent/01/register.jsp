<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="do_register.jsp" method="post">
用户：<input type="text" name="userName"/><br/>
技能：
<input type="checkbox" name="skills" value="java"/>java
<input type="checkbox" name="skills" value="python"/>python
<input type="checkbox" name="skills" value="go"/>go
<br/>
<input type="submit" value="提交"/>
<input type="reset" value="重置"/>
</form>
</body>
</html>