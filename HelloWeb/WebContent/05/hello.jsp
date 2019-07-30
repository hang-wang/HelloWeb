
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello world</title>
</head>
<body>

this is hello.jsp <br/><br/>

<%
	String str = "hello jikexueyuan";
	out.println(str);
%>

<br/>
<br/>
返回首页 <a href="<%= request.getContextPath() %>/05/index.jsp">index.jsp</a><br/>
</body>
</html>