package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ua.krasovskij.utils.EventUtil;

import ua.krasovskij.service.ComunicateEvents;

@WebServlet(name = "AddEvent", urlPatterns = "/add")
public class AddEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String TITLE = "title" ;
	private final String DATE = "day";
	private final String TIME = "time";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		PrintWriter out = response.getWriter();
		try{
		out.println(ComunicateEvents.add(EventUtil.createEvent(request.getParameter(TITLE), request.getParameter(DATE), request.getParameter(TIME))));
		}
		catch(NullPointerException e){
			out.println("Error");		
		}
		
		

	}

	
}
