<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!int counter = 0;
    
    public int count(){
    	return ++counter;
    } %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>request countr</h2>
<p> page request: <%=count() %> times.</p>






</body>
</html>