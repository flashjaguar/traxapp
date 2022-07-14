<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="savebill" method="post">
<pre>
FirstName:<input type="text" name="firstName" value="${contacts.firstName}"/>
LastName:<input type="text" name="lastName" value="${contacts.lastName}"/>
email:<input type="text" name="email" value="${contacts.email}"/>
mobile:<input type="text" name="mobile" value="${contacts.mobile}"/>
productName:<input type="text" name="productName"/>
amount:<input type="text" name="amount"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>