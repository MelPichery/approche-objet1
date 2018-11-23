package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		
		//création et initialisation des variables
		int longueurChaineMax = Integer.MIN_VALUE;
		String motLongueurMax = null;
		
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		//population de set
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		//creation de l'iterateur
		Iterator<String> it = set.iterator();
		
		//tant qu'il y a une valeur dans l'itérateur
		while (it.hasNext()) {
			
			//la variable chaine prend la valeur de l'itérateur
			String chaine = it.next();
			
			//la variable longueurChaine prend la valeur de la longueur de la chaine de caractères
			int longueurChaine = chaine.length();
			
			//si la chaine a une longueur supérieure à longueur max 
			if (longueurChaine > longueurChaineMax ) {
				
				//alors longueur max prend la valeur de la longueur de la chaine et on récupère le mot qui correspond
				longueurChaineMax = longueurChaine;
				motLongueurMax = chaine ;
								
			}
														
		}
		
		//suppression du mot le plus long
		set.remove(motLongueurMax);
		
		//création de l'itérateur
		Iterator<String> it2 = set.iterator();
		
		//tant qu'il y a une valeur dans l'itérateur
		while (it2.hasNext()) {
			
			//la variable chaine prend la valeur de l'itérateur
			String chaine = it2.next();
			
			//chaine prend la valeur de la chaine en majuscule
			chaine = chaine.toUpperCase();
			
			//population de set2 avec la variable chaine
			set2.add(chaine);
			
		}
		
		//affichage de set2
		System.out.println(set2);
	}

}
