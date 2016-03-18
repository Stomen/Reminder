package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ua.krasovskij.service.EventService;

@WebServlet(name = "RemoveEventServlet", urlPatterns = "/remove")
public class RemoveEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html";
	private static final String REMOVE_ID = "id";
	private static final String ERROR_REMOVE = "ERROR!!! You have not event whith this id";
	private static final String SUCCESS_REMOVE = "SUCCESS!!! You remove event";
	private static final String ERROR = "ERROR!!! You have empty id";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		Integer id = Integer.parseInt(request.getParameter(REMOVE_ID));
		if(id!=null){
			if(EventService.remove(id)){
				out.print(SUCCESS_REMOVE);
			}
			else{
				out.print(ERROR_REMOVE);
			}
		}
		out.print(ERROR);
		
	}

}
