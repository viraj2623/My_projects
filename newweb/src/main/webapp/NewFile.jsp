<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String agestr= request.getParameter("age");
 int age = Integer.parseInt(agestr);
 if(age>18){
 out.println("18 plus");
 //session.setAttribute("key","viraj");
 pageContext.setAttribute("key","om",PageContext.APPLICATION_SCOPE);
 pageContext.setAttribute("key","viraj",PageContext.SESSION_SCOPE);
 pageContext.setAttribute("key","Kalyani",PageContext.PAGE_SCOPE);
 pageContext.setAttribute("key","Shubham",PageContext.REQUEST_SCOPE);
 //response.sendRedirect("redirect.jsp");
 }

else out.println("18 below");
 


pageContext.getAttribute("key",PageContext.SESSION_SCOPE);
pageContext.getAttribute("key",PageContext.APPLICATION_SCOPE);
pageContext.getAttribute("key",PageContext.PAGE_SCOPE);
pageContext.getAttribute("key",PageContext.REQUEST_SCOPE);


%>
</body>
</html>