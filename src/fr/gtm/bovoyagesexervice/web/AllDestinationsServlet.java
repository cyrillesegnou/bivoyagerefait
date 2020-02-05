package fr.gtm.bovoyagesexervice.web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.bovoyagesexervice.DTO.DestinationDTO;
import fr.gtm.bovoyagesexervice.entities.Destination;
import fr.gtm.bovoyagesexervice.services.DestinationServices;

/**
 * Servlet implementation class AllDestinationsServlet
 */
@WebServlet("/AllDestinationsServlet")
public class AllDestinationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB private DestinationServices service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String pageaccueil ="/AllDestination.jsp";
			List<Destination> destinations = service.findAlldestinations();
			request.setAttribute("destinations", destinations);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(pageaccueil);
			rd.forward(request, response);	
			
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}