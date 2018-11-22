package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		
		String villeLongueurMax=null;
		int longueurChaine = 0;
		int longueurChaineMax = 0;
		String maChaine ="";
		
		List<String> list = new ArrayList<String>();
		
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		
		//Lecture de la liste 
		for (int i = 0; i < list.size(); i++) {
			
			 //la variable maChaine prend la valeur de la liste � l'index i
			 maChaine = list.get(i);
			
			 /*
			  * utilisation de la m�thode replace all de la classe collection pour modifier la liste en prenant 
			  * comme valeur de d�part maChaine et valeur d'arriv�e cette m�me chaine pass�e en majuscule
			  */
			 Collections.replaceAll(list, maChaine, maChaine.toUpperCase());
			 
						 			
		}
		
		//lecture de la liste
		for (int i = 0; i < list.size(); i++) {
			
			 //la variable maChaine prend la valeur de la liste � l'index i
			 maChaine = list.get(i);
			
			//Si la premi�re lettre de la chaine est �gal � N alors on supprime la chaine de la liste 
			if(maChaine.charAt(0) == 'N') {
				list.remove(maChaine);
			}
			
			
		}
		
		//affichage de la liste
		System.out.println(list);
		
		//cr�ation d'un iterator pour parcourir la liste
		Iterator<String> iterator = list.iterator();
		
		//Tant que iterator has next est vrai
		while (iterator.hasNext()) {
			
			//maChaine prend la valeur de l'it�rateur
			maChaine = iterator.next();
			
			//r�cup�ration de nombre de caract�res dans la chaine
			longueurChaine = maChaine.length();
			
			/*
			 * si la longueur de la chaine est sup�rieur � la longueur chaine max alors longueurChaineMax prend la valeur 
			 * de la longueurChaine et villeLongueurMax prend maChaine
			 */

			if(longueurChaine > longueurChaineMax) {
				
				longueurChaineMax = longueurChaine;
				
				villeLongueurMax = maChaine;
			}
						
		}
		
		//affichage ville qui a le plus grand nombre de lettre
		System.out.println("Ville qui a le plus grand nombre de lettres : "+villeLongueurMax);
		

	}

}
