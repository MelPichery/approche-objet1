package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		
		//création des sets
		HashSet<Double> set = new HashSet<Double>();
		HashSet<Double> set2 = new HashSet<Double>();
		
		//population de set
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.50);
		set.add(0.01);
		
		//affichage de set
		System.out.println(set);
		
		//affichage de la valeur max de set
		System.out.println("Elément le plus grand de la collection : "+Collections.max(set));
		
		//recherche de la valeur minimum
		Double min = Collections.min(set);
		
		//suppression de la valeur minimum dans le set
		set.remove(min);
		
		//création d'iterator
		Iterator<Double> it = set.iterator();
		
		//tant qu'il y a une valeur dans l'iterator
	    while(it.hasNext()){
	    	
	    	 //d prend la valeur de l'iterator
	         Double d = it.next();
	         
	         //si d est inférieur à 0 alors d prend la valeur opposée
	         if (d<0) {
				
	        	d = -d;
	        	
			}
	         
	         //population de set2 avec d
	         set2.add(d);
	         
	      }
		
	    //affichage de set2
		System.out.println(set2);
	}

}
