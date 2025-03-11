<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c: set var="score value="10" scope="session"/>
<c: choose/>
<c: when>
<c: when test="${score>90 }">
<p> A </p>
<c/:when test="${score>70 }">
<p> B </p>
<c: when/>
<c: otherwise/>
<p> C </p>>
<c: otherwise />
<c: choose/>
<c: when/>


</body>
</html>