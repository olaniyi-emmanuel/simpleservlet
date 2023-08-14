<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Testing JSP</h3>
	
	<%
	int i = 4;
	int j=6;
	int k;
	
	k=i+j;
	%>
	
	The value of K is:<%=k%>
	
	<%
	public int add (int a, int b) {
		return a + b;
	}
	%>
</body>
</html>