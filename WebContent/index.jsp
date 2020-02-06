<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:useBean id="myBean" beanName="myBean" scope="request" type="mines.douai.alejandra.bean.ModelBean"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Using <%=myBean.getMessage() %> </h1>

</body>
</html>