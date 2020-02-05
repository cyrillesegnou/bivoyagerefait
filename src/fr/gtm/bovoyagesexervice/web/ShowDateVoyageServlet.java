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


import fr.gtm.bovoyagesexervice.entities.DateVoyage;
import fr.gtm.bovoyagesexervice.services.DestinationServices;

/**
 * Servlet implementation class ShowDateVoyageServlet
 */
@WebServlet("/ShowDateVoyageServlet")
public class ShowDateVoyageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB private DestinationServices service ;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String identifiant = request.getParameter("idDestination");
		Long id = Long.parseLong(identifiant);
	
		List<DateVoyage> datesDestination = service.getDatesByDestinationId(id);
		request.setAttribute("datesDestination", datesDestination);
		
		List<String> images = service.getImagesByDestinationId(id);
		request.setAttribute("images", images);
		
		String page2 = "/ShowDateVoyage.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page2);
		rd.forward(request, response);

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
