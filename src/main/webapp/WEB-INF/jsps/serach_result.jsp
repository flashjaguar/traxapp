<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
  <th>First name</th>
  <th>last name</th>
  <th>email</th>
  <th>mobile</th>
  <th>LeadSource</th>
  <th>gender</th>
</tr>
<c:forEach items="${leads}" var="lead">
  <tr>
  <td><a href="leadById?id=${lead.id}">${lead.firstName}</a></td>
  <td>${lead.lastName}</td>
  <td>${lead.email}</td>
  <td>${lead.mobile}</td> 
  <td>${lead.leadsource}</td>
  <td>${lead.gender}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>