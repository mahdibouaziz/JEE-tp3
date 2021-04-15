package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="firstServlet", urlPatterns={"/fs"})
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom =req.getParameter("nom");
        req.setAttribute("nom",nom);

        RequestDispatcher rq=req.getRequestDispatcher("view/firstServlet.jsp");
        rq.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int nbLig= Integer.parseInt(req.getParameter("nbLig"));
        int nbCol= Integer.parseInt(req.getParameter("nbCol"));

        req.setAttribute("nbLig",nbLig);
        req.setAttribute("nbCol",nbCol);

        RequestDispatcher rq=req.getRequestDispatcher("view/tableauDynamique.jsp");
        rq.forward(req,resp);
    }
}
