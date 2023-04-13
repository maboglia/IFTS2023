<%@page import="model.Alimento"%>
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

<h1>Alimenti</h1>

<h2><%= request.getAttribute("titolo") %></h2>
<%ArrayList<String> categorie = (ArrayList<String>)request.getAttribute("categorie"); %>
<form action=''>
<select name='cat'>
<option>scegli una categoria</option>
<%for (String categoria : categorie){ %>
<option><%= categoria %></option>
<%} %>
</select>
<input type="submit" value="cerca">
</form>

<table>
  <tr>
    <th>categoria</th>
    <th>prodotto</th>
  </tr>
  <%ArrayList<Alimento> lista = (ArrayList<Alimento>)request.getAttribute("listaAlimenti"); %>
  <%for (Alimento a : lista){ %>
  <tr>
    <td><%= a.getCategoria() %></td>
    <td><%= a.getProdotto() %></td>
  </tr>
  <%} %>
</table>




</body>
</html>