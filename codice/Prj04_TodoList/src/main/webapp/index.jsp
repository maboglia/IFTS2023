<!DOCTYPE html>

<%@page import="controller.TodoCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<!--  -->

<%

	TodoCtrl ctrl = new TodoCtrl(10);

	String descrizione = request.getParameter("todo");

	ctrl.add(descrizione);
	
	out.print(ctrl.getAll()[0]);

%>

<form action="">

	<input type="text" name="todo" placeholder="scrivi qui la cosa da fare">
	<input type="submit" value="aggiungi">
</form>




</body>
</html>