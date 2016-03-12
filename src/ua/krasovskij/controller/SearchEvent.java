package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.krasovskij.model.Event;
import ua.krasovskij.service.ComunicateEvents;
import ua.krasovskij.utils.EventUtil;

@WebServlet(name = "SearchEventServlet", urlPatterns = "/search")
public class SearchEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String PARAM = "param" ;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		for(Event event : ComunicateEvents.search(request.getParameter(PARAM))){
			out.write(EventUtil.printEvent(event));
		}
		

	}

}
