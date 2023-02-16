
<%@page import="model.Canzone"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Canzoni MVC</h1>

<table>
  <tr>
    <th>Titolo</th>
    <th>Cantante</th>
  </tr>

<% ArrayList<Canzone> canzoni = (ArrayList<Canzone>) request.getAttribute("elenco"); %>
<% for (Canzone c : canzoni) { %>
  <tr>
    <td><%= c.getTitolo() %></td>
    <td><%= c.getCantante() %></td>
  </tr>
<% } %>

</table>


</body>
</html>