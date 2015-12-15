<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>


<%
//java.util.Date today=new java.util.Date();
String text = "Today's data is" ; 
out.println(text);
%>

<%= 
// "Hello World in brackets."
new java.util.Date()

%>
</body>
</html>