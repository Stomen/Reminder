package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.krasovskij.model.Event;
import ua.krasovskij.service.EventService;;


@WebServlet(name = "SearchEventServlet", urlPatterns = "/search")
public class SearchEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String PARAM = "param" ;
	private static final String CONTENT_TYPE = "text/html";
	private static final String ERROR = "ERROR!!! You have empty event or bad param";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("dashboard.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		List <Event> event = EventService.search(request.getParameter(PARAM));
		if(request.getParameter(PARAM).isEmpty() || event==null){
			out.print(ERROR);
		}
		for(Event searchEvent : event){
			out.write(searchEvent.toString());
		}
		

	}

}
