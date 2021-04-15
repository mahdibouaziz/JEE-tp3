package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="identification", urlPatterns={"/identification"})
public class Identification extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rq=req.getRequestDispatcher("view/identification.html");
        rq.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login =req.getParameter("login");
        String password =req.getParameter("password");

        if(login.equals(password)){
            RequestDispatcher rq=req.getRequestDispatcher("view/insertionEtudiant.html");
            rq.forward(req,resp);
        }else{
            RequestDispatcher rq=req.getRequestDispatcher("view/echec.html");
            rq.forward(req,resp);
        }

    }
}
