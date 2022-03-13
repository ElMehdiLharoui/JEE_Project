package com.example.TP2JAVA;

import Model.Livre;
import Model.cart;
import Model.utilisateur;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class panelController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("VIEW/panel.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        cart c = cart.getcart();
        utilisateur utili = new utilisateur("mehdi","lharoui");
        response.sendRedirect(request.getContextPath()+ "/panel");
        String[] noms=request.getParameterValues("livre");
        for(String nom : noms){
            Livre li =c.getLivre().stream().filter(e->e.getId()==Integer.parseInt(nom)).findFirst().get();
            utili.getC().addLivres(li);

        }
        request.getRequestDispatcher( "VIEW/panel.jsp").forward(request,response);
    }
}
