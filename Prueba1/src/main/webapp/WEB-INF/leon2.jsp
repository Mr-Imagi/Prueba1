<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prueba Leon</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>
<body>
<div>
<table class="table">
 <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Color</th>
      <th scope="col">Sexo</th>
      <th scope="col">Edad</th>
    </tr>
    </thead>
     <tbody>
    <c:forEach var="leon" items="${leonesCapturados}">
<p>${leon.color} ${leon.sexo} ${leon.edad}</p>
<tr>
      <th scope="row">${leon.id}</th>
      <td>${leon.color}</td>
      <td>${leon.sexo}</td>
      <td>${leon.edad}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<c:if test="${msgError!=null}">
<c:out value="${msgError}"></c:out>
</c:if>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>