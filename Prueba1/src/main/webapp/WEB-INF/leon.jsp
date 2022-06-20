<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prueba Leon</title>
</head>
<body>
<div>
<c:if test="${msgError!=null}">
<c:out value="${msgError}"></c:out>
</c:if>
<form:form action="/leon/guardarleon" method="post" modelAttribute="leon">
<form:label path="color">Color:</form:label>
<form:input path="color"/>
<br>
<form:label path="sexo"> Sexo:</form:label>
<form:input path="sexo"/>
<br>
<form:label path="edad">Edad:</form:label>
<form:input type="number" path="edad"/>
<br>
<input type="submit" value ="Registrar">

</form:form>
</div>

</body>
</html>