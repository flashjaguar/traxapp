<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing info</title>
</head>
<body>
<h2>billing info</h2>
id:${billing.id}<br/>
firstName:${billing.firstName}<br/>
lastName:${billing.lastName}<br/>
email:${billing.email}<br/>
mobile:${billing.mobile}<br/>
productName:${billing.productName}<br/>
amount:${billing.amount}<br/>

</body>
</html>