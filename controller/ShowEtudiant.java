package controller;

import model.Etudiant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowEtudiant", urlPatterns = { "/ShowEtudiant" })
public class ShowEtudiant extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("data", Etudiant.etudiantList);
        //Link to the jsp file + forward
        RequestDispatcher rd = req.getRequestDispatcher("view/afficheEtudiant.jsp");
        rd.forward(req, resp);
    }
}
