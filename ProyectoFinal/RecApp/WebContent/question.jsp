<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous"> -->
<link rel="stylesheet" href="style.css">
<title>Preguntas</title>


</head>
<body>
	<main id="viewPort"> <header
		class="site-navbar js-sticky-header site-navbar-target" role="banner">

		<div class="container">
			<div class="row align-items-center">

				<div class="col-6 col-lg-2">
					<h1 class="mb-0 site-logo">
						<a href="Login?option=validar" class="mb-0">RecApp</a>
					</h1>
				</div>
			</div>
		</div>
	</header>
	
	
	
	<div class="site-section pb-0">
		<div class="container">
			<%-- <h1>${requestScope.preguntas.tipoEneag } jbbh</h1>  --%>
			<div class="row align-items-center">
				<div class="col-md-4 mr-auto">
					<div class="row align-items-center">
					
					
						<c:forEach items="${requestScope.preguntas}" var="pregunta">
							<p class="questionP" ><c:out value="${pregunta.pregunta }" />
							</p>
							<input class="inputS" type="text" required></input>
						</c:forEach>
						<a href="GestionPreguntas?option=question" class="mb-0">siguiente</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	</main>
</body>
</html>