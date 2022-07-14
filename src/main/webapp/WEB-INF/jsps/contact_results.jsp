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
  <th>Billing</th>
</tr>
<c:forEach items="${contacts}" var="contacts">
  <tr>
  <td><a href="contactById?id=${contacts.id}">${contacts.firstName}</a></td>
  <td>${contacts.lastName}</td>
  <td>${contacts.email}</td>
  <td>${contacts.mobile}</td> 
  <td>${contacts.leadsource}</td>
  <td>${contacts.gender}</td>
  <td><a href="generateBill?id=${contacts.id}">billing</a></td>
  </tr>
</c:forEach>
</table>
</body>
</html>