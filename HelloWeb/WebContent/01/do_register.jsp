<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userName=request.getParameter("userName");
String skills="";
String[] skillAll=request.getParameterValues("skills");
if(skillAll !=null && skillAll.length>0){
	for(String skill:skillAll){
		skills=skills+skill+" ";
	}
}
request.setAttribute("userName",userName);
request.setAttribute("skills",skills);
%>
<jsp:forward page="welcom.jsp"></jsp:forward>