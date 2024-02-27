package StatistiqueEtudiant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Stats {
	private ArrayList<Etudiant> etudiants;
	
	 public Stats() {
	        this.etudiants = new ArrayList<>();
	    }


		    public void afficherStatsEtudiants(List<Etudiant> L) {
		        Iterator<Etudiant> i=L.iterator();
		        while(i.hasNext())
		        	i.next().toString();
		            System.out.println("Etudiant: " + ((Etudiant) i).getNom());
		            System.out.println("Moyenne: " + ((Etudiant) i).getValue());
		            System.out.println("Meilleure note: " + ((Etudiant) i).getMaxNote());
		            System.out.println("Moins bonne note: " + ((Etudiant) i).getMinNote());
		            System.out.println();
		        }
		    

		    public float getMoyenneGroupe() {
		        if (etudiants.size() == 0) return 0;
		        float sum = 0;
		        for (Etudiant etudiant : etudiants) {
		            sum += etudiant.getValue();
		        }
		        return sum / etudiants.size();
		    }

		    public Etudiant getMaximumGroupe() {
		        if (etudiants.size() == 0) return null;
		        Etudiant mEtudiant = etudiants.get(0);
		        for (Etudiant etudiant : etudiants) {
		            if (etudiant.getValue() > mEtudiant.getValue()) {
		                mEtudiant = etudiant;
		            }
		        }
		        return mEtudiant;
		    }

		    public Etudiant getMinimumGroupe() {
		        if (etudiants.size() == 0) return null;
		        Etudiant moinsBonEtudiant = etudiants.get(0);
		        for (Etudiant etudiant : etudiants) {
		            if (etudiant.getValue() < moinsBonEtudiant.getValue()) {
		                moinsBonEtudiant = etudiant;
		            }
		        }
		        return moinsBonEtudiant;
		    }
		    
		    void trierListe()
		    {
		    	Collections.sort(this.etudiants);
		    }
		   
			void trierMat()
		    {
		    	comparatorMat CM=new comparatorMat();
		    	Collections.sort(this.etudiants,CM);
		    	
		    }
			void trierNom() {
				comparatorN CN=new comparatorN();
		    	Collections.sort(this.etudiants,CN);
			}
		    


		
}
		
	


