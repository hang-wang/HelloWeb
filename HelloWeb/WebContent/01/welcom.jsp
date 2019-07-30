<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息展示界面</title>
</head>
<body>
信息显示界面<br/>
用户名：<%= request.getAttribute("userName") %><br/>
技能：<%= request.getAttribute("skills") %><br/>
</body>
</html>