<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
   String email = request.getParameter("email");
   String pass = request.getParameter("pass");
   
   if(pass.equals("1234"))
   {
	   out.print("welcome");
   }
   else
   {
	   out.print("fail");
   }

%>

</body>
</html>