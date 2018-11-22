package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		
		//cr�ation et initialisation des variables
		String nomVilleMaxHabitants = "";
		int nbreVilleMaxHabitants = 0;
				
		int nbreVilleMinHabitants = Integer.MAX_VALUE;
		int villeMinIndex=0;
		
		List<Ville> listVille = new ArrayList<Ville>();
		
		//ajout des villes dans la liste
		listVille.add(new Ville("Nice",343000));
		listVille.add(new Ville("Carcassonne",47800));
		listVille.add(new Ville("Narbonne",53400));
		listVille.add(new Ville("Lyon",484000));
		listVille.add(new Ville("Foix",9700));
		listVille.add(new Ville("Pau",77200));
		listVille.add(new Ville("Marseille",850700));
		listVille.add(new Ville("Tarbes",40600));

		//lecture de la liste
		for (int i = 0; i < listVille.size(); i++) {
			
			//la variable ville prend la valeur de la liste � l'index i
			Ville ville = listVille.get(i);
			
			//si nbre d'habitants est sup�rieur au nombre max
			if(ville.getNbreHabitants()> nbreVilleMaxHabitants) {
				
				//alors nbre max prend la valeur du nombre d'habitants de la ville
				nbreVilleMaxHabitants = ville.getNbreHabitants();
				nomVilleMaxHabitants = ville.getNom();
			}
		}
		
		//affichage de la ville la plus peupl�e
		System.out.println("Ville la plus peupl�e : "+nomVilleMaxHabitants);
		
		//lecture de la listeville
		for (int i = 0; i < listVille.size(); i++) {
			
			//la variable ville prend la valeur de la liste � l'index i
			Ville ville = listVille.get(i);
			
			//si nbre d'habitants est inf�rieur au nombre min
			if (ville.getNbreHabitants()<nbreVilleMinHabitants) {
				
				//alors nbre min prend la valeur du nombre d'habitants de la ville
				nbreVilleMinHabitants = ville.getNbreHabitants();
				
				//villeMinIndex prend la valeur de l'index de la ville
				villeMinIndex = listVille.indexOf(ville);
			}
				
		}
		
		//suppression de la liste de la ville la moins peupl�e
		listVille.remove(villeMinIndex);
		
		//lecture de la liste
		for (int i = 0; i < listVille.size(); i++) {
			
			//la variable ville prend la valeur de la liste � l'index i
			Ville ville = listVille.get(i);
			
			//si la ville a plus de 100 000 habitants alors le nom de la ville passe en majuscule
			if (ville.getNbreHabitants()>100000) {
				
				 ville.setNom(ville.getNom().toUpperCase()) ;
				
			}
			
		}
		
		//affichage de la liste
		System.out.println(listVille);
		
	}
		
}
