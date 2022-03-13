package com.example.TP2JAVA;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import Model.*;



public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            request.getRequestDispatcher("VIEW/login.jsp").forward(request, response);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String log=request.getParameter("uname");
        String psw=request.getParameter("psw");



       utilisateur u = new utilisateur(log,psw);

        if(u.auth_info(u) == true)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("user",u);

            response.sendRedirect(request.getContextPath()+ "/cart");

        }

        else out.println("<h2>Wrong<h2>");


    }


    public void destroy() {
    }
}