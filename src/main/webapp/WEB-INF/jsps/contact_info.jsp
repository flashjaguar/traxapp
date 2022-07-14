<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
<h2>contact info</h2>
id:${contacts.id}<br/>
firstName:${contacts.firstName}<br/>
lastName:${contacts.lastName}<br/>
email:${contacts.email}<br/>
mobile:${contacts.mobile}<br/>
leadSource:${contacts.leadsource}<br/>
gender:${contacts.gender}<br/>

<form action="convertlead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>