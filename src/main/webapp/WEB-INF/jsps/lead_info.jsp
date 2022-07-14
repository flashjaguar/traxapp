<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<h2>Lead info</h2>
id:${lead.id}<br/>
firstName:${lead.firstName}<br/>
lastName:${lead.lastName}<br/>
email:${lead.email}<br/>
mobile:${lead.mobile}<br/>
leadSource:${lead.leadsource}<br/>
gender:${lead.gender}<br/>

<form action="convertlead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>