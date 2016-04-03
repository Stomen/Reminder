package ua.krasovskij.controller;

import java.io.IOException;


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
	private static final String ERROR_ADD = "Error, event not add";
	private static final String SUCCESS_ADD = "SUCCESS! Product was added";
	private static final String ERROR_NULL_EVENT = "System error. null event";
	private static final String ERROR_ELLEGAL_ARGUMENT = "Error, empty parameters";
	private static final String ERROR = "Error";
	private static final String PARAM_IS_EMPTY = "Error empty param ";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("add.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType(CONTENT_TYPE);
		if (request.getParameter(TITLE).isEmpty() || request.getParameter(DATE).isEmpty()
				|| request.getParameter(TIME).isEmpty()) {
			request.setAttribute("messageFalse", PARAM_IS_EMPTY);
		}
		try {
			Event event = EventUtil.createEvent(request.getParameter(TITLE), request.getParameter(DATE),
					request.getParameter(TIME));
			if (event == null) {
				request.setAttribute("messageFalse", ERROR_NULL_EVENT);
			} else {
				if (EventService.add(event)) {
					request.setAttribute("messageTrue", SUCCESS_ADD);
				} else {
					request.setAttribute("messageFalse", ERROR_ADD);
				}
			}
		} catch (IllegalArgumentException e) {
			request.setAttribute("messageFalse", ERROR_ELLEGAL_ARGUMENT + e.getMessage());
		} catch (Exception e) {
			request.setAttribute("messageFalse", ERROR + e.getMessage());
		}
		request.getRequestDispatcher("add.jsp").forward(request, response);
	}
}
