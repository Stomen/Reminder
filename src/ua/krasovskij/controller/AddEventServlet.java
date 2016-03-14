package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ua.krasovskij.utils.EventUtil;

import ua.krasovskij.service.EventService;


@WebServlet(name = "AddEvent", urlPatterns = "/add")
public class AddEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "title";
	private static final String DATE = "date";
	private static final String TIME = "time";
	private static final String CONTENT_TYPE = "text/html";
	private static final String ERROR_ADD = "ERROR!!! Your event were not add";
	private static final String SUCCESS_ADD = "SUCCESS!!! Your event were add";
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		if(EventService.add(EventUtil.createEvent(request.getParameter(TITLE), request.getParameter(DATE), request.getParameter(TIME)))){
			out.print(SUCCESS_ADD);
		}
		else{
			out.print(ERROR_ADD);
		}
		
		
		
		
		
		
		

	}

	
}