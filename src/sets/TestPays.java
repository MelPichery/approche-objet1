package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		Double pibHabitantMax = Double.MIN_VALUE;
		String paysPibHabitantMax = null;
		Long pibPays = null;
		Long pibPaysMax = Long.MIN_VALUE;
		String nomPibPayxMax= null;
		Long pibPaysMin = Long.MAX_VALUE;
		Pays pibMin = null ;
		
		HashSet<Pays> setPays = new HashSet<Pays>();
		
		//population de setPays
		setPays.add(new Pays("USA",325700000,59531.66));
		setPays.add(new Pays("France",67200000,38476.66));
		setPays.add(new Pays("Allemagne",82790000,44469.91));
		setPays.add(new Pays("UK",66020000,39720.44));
		setPays.add(new Pays("Italie",60590000,31952.98));
		setPays.add(new Pays("Japon",126800000,38428.10));
		setPays.add(new Pays("Chine",1386000000,8826.99));
		setPays.add(new Pays("Russie",144500000,10743.10));
		setPays.add(new Pays("Inde",1339000000,1939.61));
		
		//création de l'itérateur
		Iterator<Pays> it = setPays.iterator();
		
		//tant qu'il y a une valeur dans l'itérateur
		while (it.hasNext()) {
			
			//la variable pays prend la valeur de l'itérateur
			Pays pays = it.next();
			
			//si le pib/habitant du pays est supérieur au pib/habitant max
			if (pays.getPibParHabitant()>pibHabitantMax) {
				
				//alors pibHabitantMax prend la valeur du pib/habitant du pays et on récupére le nom du pays qui correspond
				pibHabitantMax = pays.getPibParHabitant();
				paysPibHabitantMax = pays.getNom();
			}
			
		}
		
		//pour chaque pays de setPays
		for (Pays pays : setPays) {
			
			//calcul du pib total par pays
			pibPays = (long) (pays.getPibParHabitant() * pays.getNbreHabitants()) ;
			
			//si le pib total du pays est supérieur au pib total max
			if (pibPays>pibPaysMax) {
				
				//alors pibPaysMax prend la valeur de pibPays et récupération du nom du pays qui correspond
				pibPaysMax = pibPays;
				nomPibPayxMax = pays.getNom();
				
			}
			
			//si le pib total du pays est inférieur au pib total min
			if (pibPays<pibPaysMin) {
				
				//alors pibPaysMin prend la valeur de pibPays et récupération du nom du pays qui correspond
				pibPaysMin = pibPays;
				pibMin = pays ;
			}
						
		}
		
		//modification du nom pour le pays ayant le pib minimum en majuscule
		pibMin.setNom(pibMin.getNom().toUpperCase());

		//suppression du pays qui a le pib minimu
		setPays.remove(pibMin);
		
		//affichages du pays avec pib/habitant max, du pays avec le pib total max
		System.out.println("Pays avec le PIB/habitant le plus important : "+paysPibHabitantMax);
		
		System.out.println("Pays avec le PIB total le plus important : "+nomPibPayxMax);
		
		//pour chaque pays dans setPays
		for (Pays pays : setPays) {
			
			//calcul du pib total du pays
			Long pibTotalPays = (long) (pays.getPibParHabitant() * pays.getNbreHabitants()) ;
			
			//affichage du nom du pays, du nombre d'habitants et du pib total
			System.out.println("Nom : " + pays.getNom()+",  nbre d'habitants : "+pays.getNbreHabitants()+",   pib total : "+pibTotalPays);
			
		}
		
		
	}

}
