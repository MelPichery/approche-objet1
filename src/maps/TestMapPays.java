package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sets.Pays;

public class TestMapPays {
	
	public static Map<String,Pays> mapPays = new HashMap<>();
	
	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		boolean continuer = true ;
		int option = 0;
		String paysUtilisateur = null;
		String paysASupprimer = null;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		//population de mapPays
		mapPays.put("USA", new Pays("USA",325700000,59531.66));
		mapPays.put("France", new Pays("France",67200000,38476.66));
		mapPays.put("Allemagne", new Pays("Allemagne",82790000,44469.91));
		mapPays.put("UK", new Pays("UK",66020000,39720.44));
		mapPays.put("Italie", new Pays("Italie",60590000,31952.98));
		mapPays.put("Japon", new Pays("Japon",126800000,38428.10));
		mapPays.put("Chine", new Pays("Chine",1386000000,8826.99));
		mapPays.put("Russie", new Pays("Russie",144500000,10743.10));
		mapPays.put("Inde", new Pays("Inde",1339000000,1939.61));
		
		
		while (continuer) {
			
			System.out.println("*****  Pays  *****\n1.\tAfficher les informations concernant un pays\n2.\tSupprimer un pays\n"
					+ "3.\tAfficher la liste des pays\n99.\tSortir");
			
			//affichage et sauvegarde de l'option donnée par l'utilisateur
			System.out.println("\nVeuillez faire un choix");
			option = sc.nextInt();
			
			if (option == 1) {
				
				System.out.println("Quel Pays ?");
				paysUtilisateur = sc1.nextLine();
				
				if (isPaysExist(paysUtilisateur)) {
					
					//affichage des informations du pays
					System.out.println(mapPays.get(paysUtilisateur));
					
				}else {
					System.out.println("Ce pays n'existe pas");
				}
								
				
			}
			
			if (option == 2) {
				
				System.out.println("Quel Pays ?");
				paysASupprimer = sc2.nextLine();
				
				if (isPaysExist(paysASupprimer)) {
					
					mapPays.remove(paysASupprimer);
					
				}else {
					
					System.out.println("Ce pays n'existe pas");
					
				}
				
			}
			
			if (option == 3) {
				
				System.out.println(Arrays.asList(mapPays));
				
			}
			
			if (option == 99) {
				
				System.out.println("Au revoir !");
				
				sc.close();
				sc1.close();
				sc2.close();
				
				continuer = false;
												
			}
		}
		
	}

	
	public static boolean isPaysExist(String pays) {
		
		boolean result = false;
		
		//pour chaque clé de la map mapPays
		for(Map.Entry<String, Pays> entry : mapPays.entrySet()) {
			
			//la varaibale key prend la valeur de la clé de la map
		    String key = entry.getKey();

		    //si la variable pays est égale à key
		    if (pays.equals(key)) {
				
		    	//result est vrai
		    	result = true ;
			}
		    
		}
		
		return result ;
	}
}
