<%@page import="model.Teatro"%>
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

	<h1>Teatri Torino</h1>

<table>
  <tr>
    <th>Nome teatro</th>
    <th>Numero posti</th>
  </tr>

<% ArrayList<Teatro> teatri = (ArrayList<Teatro>) request.getAttribute("elenco"); %>
<% for (Teatro t: teatri) { %>  
  
  <tr>
    <td><%= t.getNome() %></td>
    <td><%= t.getnPosti() %></td>
  </tr>

<% } %>

</table>



</body>
</html>