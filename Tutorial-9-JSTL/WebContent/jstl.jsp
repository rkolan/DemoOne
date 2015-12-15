<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="Hello World" />
<jsp:useBean id="test1" class="bean.TestBean" scope="page" /> 
<c:out value="${test1.info}" />


<%-- Name parameters --%> <br/>
Name parameter: <c:out value="${param.name}" />


<%-- JSTL IF --%>
<c:if test='${param.name == "kolan" }'>
Hello Kolan
</c:if>
<c:if test='${param.name != "kolan" }'>
Hello u r out
</c:if>


<%-- JSTL Choose --%>
<c:choose>
<c:when test="${param.id==1 }">
ID is equal to 1<br/>
</c:when>
<c:when test="${param.id==2 }">
ID is equal to 2<br/>
</c:when>
<c:otherwise>
<b> ID is 100</b>
</c:otherwise>
</c:choose>

<%-- JSTL for loop --%>
<c:forEach var="i" begin="0" end="10" step="2">
<br> Loop Count is: <c:out value="${i}"></c:out> </br>

</c:forEach>
</body>
</html>