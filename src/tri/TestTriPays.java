package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tri.Pays;

public class TestTriPays {

	public static void main(String[] args) {
		
		//création de la liste
		List<Pays> pays = new ArrayList<Pays>();
		
		//population de la liste
		pays.add(new Pays("USA",325700000,59531.66));
		pays.add(new Pays("France",67200000,38476.66));
		pays.add(new Pays("Allemagne",82790000,44469.91));
		pays.add(new Pays("UK",66020000,39720.44));
		pays.add(new Pays("Italie",60590000,31952.98));
		pays.add(new Pays("Japon",126800000,38428.10));
		pays.add(new Pays("Chine",1386000000,8826.99));
		pays.add(new Pays("Russie",144500000,10743.10));
		pays.add(new Pays("Inde",1339000000,1939.61));
		
		//tri avec le compareTo de la classe Pays
		Collections.sort(pays);
				
		System.out.println(pays);
		
		System.out.println("********************************************************************");
		
		//Tri avec la classe ComparatorHabitant
		Collections.sort(pays, new ComparatorHabitant());
		
		System.out.println(pays);
		
		System.out.println("********************************************************************");
		
		//Tri avec la classe ComparatorPibHabitant
		Collections.sort(pays, new ComparatorPibHabitant());
		
		System.out.println(pays);
		
	}

}
