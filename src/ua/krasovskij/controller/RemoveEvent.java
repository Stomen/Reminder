package ua.krasovskij.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.krasovskij.service.ComunicateEvents;

@WebServlet(name = "RemoveEventServlet", urlPatterns = "/remove")
public class RemoveEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String REMOVE_ID = "id";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.print(ComunicateEvents.remove(Integer.parseInt(request.getParameter(REMOVE_ID))));

	}

}
