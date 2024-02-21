<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="m1" class="com.mod.Model"></jsp:useBean>    
<jsp:setProperty property="*" name="m"/> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

int status = Dao.savedate(m1);

if(status>0)
{
	response.sendRedirect("index.jsp");
}
else
{
	out.print("fail");
}
%>

</body>
</html>