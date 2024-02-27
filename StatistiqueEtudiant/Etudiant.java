package StatistiqueEtudiant;

import java.util.ArrayList;


public class Etudiant implements IStatisticable,Comparable<Etudiant> {
	private String matricule;
	private String nom;
	ArrayList <Note> note;
	public Etudiant(String matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
		this.note = new ArrayList<>();
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Note> getNote() {
		return note;
	}
	public void setNote(ArrayList<Note> note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", note=" + note + "]";
	}
	public void addNote(Note N) {
		note.add(N);
	}
	public String getMaxNote() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMinNote() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public float getValue() {
	     if (note.size() == 0) return 0;
	        float sum = 0;
	        for (Note notes : note) {
	            sum += ((IStatisticable) note).getValue();
	        }
	        return sum / note.size();
	    }
	
    public int compareTo(Etudiant E) {
        
        return Float.compare(this.getValue(), E.getValue());
    }

	


		
	}
		

			

		
	

	
	


