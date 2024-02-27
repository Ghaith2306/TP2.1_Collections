package StatistiqueEtudiant;

import java.util.Comparator;

public class comparatorN implements Comparator<Etudiant> {

	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		return o1.getNom().compareTo(o2.getNom());
	}}
