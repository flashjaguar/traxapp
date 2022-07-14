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
<form action="savelead" method="post">
<pre>
FirstName:<input type="text" name="firstName"/>
LastName:<input type="text" name="lastName"/>
email:<input type="text" name="email"/>
mobile:<input type="text" name="mobile"/>
LeadSource:<select name="leadsource">
			  <option value="radio">Radio</option>
			  <option value="tv">Tv</option>
			  <option value="newspaper">News paper</option>
			  <option value="relative">Relative</option>
			</select>
Gender:
male:<input type="radio" name="gender" value="male"/>
female:<input type="radio" name="gender" value="female"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>