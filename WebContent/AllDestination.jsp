<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>


	<head>
		<meta charset="UTF-8">
		<title>Destinations</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	</head>
	
<!-- 	----------------------------------------------------------------------- -->
	
	<body>
	
 <fmt:setLocale value = "fr_FR"/>
<h2>${destination }</h2>

		<h2>Destinations</h2>
	<c:forEach items="${destinations }" var="destination">
	<div>
			
			<img class = "card-img-top" src = "images/${destination.images[0] }" style ="width:170px; height:170px; display: block;
											 margin-left: auto; margin-right: auto;">
											 
<%-- 		" --%>
			<div>${destination.description}</div>
			
			<div>"${destination.region}"</div>
			<div><a href= "ShowDateVoyageServlet?id=${destination.id }">Voir les dates de voyage</a></div>
			<div><a href= "DescriptionServlet?id=${destination.description }">Description de la destination</a></div>
	</div>
	</div>
	</c:forEach>

		
	</body>
	
</html>