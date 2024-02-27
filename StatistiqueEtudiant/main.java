package StatistiqueEtudiant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("01", "Ghaith");
        etudiant1.addNote(new Note("Math", 85));
        etudiant1.addNote(new Note("Physics", 78));
        etudiant1.addNote(new Note("History", 90));

        
        ArrayList<Etudiant> Etudiants = new ArrayList<>();
        Etudiants.add(etudiant1);
       

        
        Stats stats = new Stats();

        
        System.out.println("Statistiques des étudiants :");
        stats.afficherStatsEtudiants(Etudiants);

        
        System.out.println("Moyenne du groupe : " + stats.getMoyenneGroupe());

        
        System.out.println("Meilleur étudiant : " + stats.getMaximumGroupe().getNom());

        
        System.out.println("Moins bon étudiant : " + stats.getMinimumGroupe().getNom());

        Collections.sort(Etudiants);
        System.out.println("\nListe des étudiants triés par moyenne :");
        for (Etudiant etudiant : Etudiants) {
            System.out.println(etudiant.getNom() + " - Moyenne : " + etudiant.getValue());
        }

       
        Collections.sort(Etudiants, new comparatorMat());
        System.out.println("\nListe des étudiants triés par matricule :");
        for (Etudiant etudiant : Etudiants) {
            System.out.println(etudiant.getNom() + " - Matricule : " + etudiant.getMatricule());
        }

       
        Collections.sort(Etudiants, new comparatorN());
        System.out.println("\nListe des étudiants triés par nom :");
        for (Etudiant etudiant :Etudiants) {
            System.out.println(etudiant.getNom());
        }
    }
}