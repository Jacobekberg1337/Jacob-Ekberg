<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {background-color: #7fffd4;}
</style>
<body>





<h1>



Questionnaire



</h1>


<%

String Age=request.getParameter("Age");  
out.print("You picked "+Age); 
 
%>



</body>

<footer>


<p> Thank you for your answer. </p>



</footer>
</html>