package controller;

import model.Etudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="insertionEtudiant", urlPatterns={"/insertionEtudiant"})
public class InsertionEtudiant extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom =req.getParameter("nom");
        String prenom =req.getParameter("prenom");
        String cin =req.getParameter("cin");

        Etudiant et = new Etudiant(nom, prenom, cin);
        Etudiant.etudiantList.add(et);

        resp.sendRedirect("ShowEtudiant");


    }
}
