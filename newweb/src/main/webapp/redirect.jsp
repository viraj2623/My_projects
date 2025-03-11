<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=pageContext.getAttribute("key",PageContext.APPLICATION_SCOPE)%>
<%=pageContext.getAttribute("key",PageContext.SESSION_SCOPE)%>
<%=pageContext.getAttribute("key",PageContext.PAGE_SCOPE)%>
<%=pageContext.getAttribute("key",PageContext.REQUEST_SCOPE)%>



</body>
</html>