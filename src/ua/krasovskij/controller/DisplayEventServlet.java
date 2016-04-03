package ua.krasovskij.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.krasovskij.model.Event;
import ua.krasovskij.service.EventService;



@WebServlet(name = "DisplayEvent", urlPatterns = "/display")
public class DisplayEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 List <Event> event = EventService.display();
		response.setContentType(CONTENT_TYPE);
		request.setAttribute("listEvent",event);
		request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		
	}
	
	

}
