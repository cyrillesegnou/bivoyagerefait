<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
			<meta charset="UTF-8">
			<title>Formule de voyages</title>
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>		
	</head>
<!-- 	=========================================================== -->
	<body>
	
	
			<h2> Vos Dates de Voyages (Bientot les Vacances !!!!!)</h2>
			
			<a href = "AllDestinationsServlet"> Home</a>
			
			<c:forEach items = "${datesDestination}" var = "date">
				<tbody>
					<tr>
						<td>${date.date_depart}</td>
						<td>${date.date_retour}</td>
						<td>${date.prixHT}</td>
						<td><a href = "ReservationDestServlet"></a></td>
					
					</tr>
				
				</tbody>	
			</c:forEach>
		
	
	</body>
	
	
</html>