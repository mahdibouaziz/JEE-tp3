package model;

import java.util.ArrayList;

public class Etudiant {

    public  static ArrayList<Etudiant> etudiantList = new ArrayList<>() ;

    public String nom;
    public String prenom;
    public String cin;

    public Etudiant(String nom, String prenom, String cin) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

}
