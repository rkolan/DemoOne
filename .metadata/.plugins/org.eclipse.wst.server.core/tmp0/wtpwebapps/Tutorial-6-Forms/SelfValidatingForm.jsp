<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user1" class="beans.User" scope="session"></jsp:useBean>
<jsp:setProperty name="user" property="*"/>


<%
String action=request.getParameter("action");
if(action != null && action.equals("formsubmit")){
if(user1.validate()){
	request.getRequestDispatcher("/Controller").forward(request, response);
}
}
	
%>
<h2>
<jsp:getProperty name="user1" property="message" />
</h2>

<form action="/Tutorial-6-Forms/SelfValidatingForm.jsp" method="post">

<input type="hidden" name="action" value="formsubmit" />
<input type="text" name="user" value="<jsp:getProperty name="user1" property="user" />"/> <br/>
<input type="password" name="password" value="<jsp:getProperty name="user1" property="password" />"/>
<input type="submit" value="OK" />
</form>
</body>
</html>