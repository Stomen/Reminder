package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ua.krasovskij.utils.EventUtil;
import ua.krasovskij.model.Event;
import ua.krasovskij.service.EventService;


@WebServlet(name = "AddEvent", urlPatterns = "/add")
public class AddEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "title";
	private static final String DATE = "date";
	private static final String TIME = "time";
	private static final String CONTENT_TYPE = "text/html";
	private static final String ERROR_ADD = "ERROR!!! Your event were not add";
	private static final String EVENT_IS_EMPTY = " Your event were empty";
	private static final String SUCCESS_ADD = "SUCCESS!!! Your event were add";
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("add.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		try{
			Event util= EventUtil.createEvent(request.getParameter(TITLE), request.getParameter(DATE), request.getParameter(TIME));
			if(util == null){
				request.setAttribute("message", ERROR_ADD);
				out.print(ERROR_ADD + EVENT_IS_EMPTY);
				System.out.print("1");
			}
			else{
				if(EventService.add(util)){
					request.setAttribute("message", SUCCESS_ADD);
					out.print(SUCCESS_ADD);
					System.out.print("2");
				}
				else{
					request.setAttribute("message", ERROR_ADD);
					out.print(ERROR_ADD);
					System.out.print("3");
				}
			}
		}
		catch(IllegalArgumentException e){
			request.setAttribute("message", ERROR_ADD);
			out.print(ERROR_ADD + e.getMessage());
		}
		catch(Exception e){
			request.setAttribute("message", ERROR_ADD);
			out.print(ERROR_ADD + e.getMessage());
		}
		
		request.getRequestDispatcher("add.jsp").forward(request, response);
	}
}
