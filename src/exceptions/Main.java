package exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException {
		
		Boolean continuer = true;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String valeur1 = null;
		String valeur2 = null;
		Integer valeurFinale = null;
		
		while (continuer) {
		
			try {
				
				System.out.println("Veuillez entrer une première valeur"); 
						
				valeur1 = sc.nextLine();
				
				
				System.out.println("Veuillez entrer une deuxième valeur");
				valeur2 = sc1.nextLine();
				
				if (valeur2.isEmpty()) {
					
					System.out.println("Fin");
					continuer = false;
								
				}
						  					
				valeurFinale = additionner(valeur1, valeur2) ;
				
				System.out.println("L'addition de la première valeur avec la deuxième donne le résultat : "+valeurFinale);
				
			} catch (NumberFormatException e) {
				
				System.out.println("L'addition ne peut pas se réaliser "+e.getMessage());				

			}
							
		}
		
	}

	
	private static Integer additionner(String v1, String v2) throws NumberFormatException {
		
		Integer v1parse = Integer.parseInt(v1);
		
		Integer v2parse = Integer.parseInt(v2);
		
		if (v1parse instanceof Integer && v2parse instanceof Integer) {
		
			Integer resultat;
			
			resultat = v1parse + v2parse  ;
			
			return resultat;

		}else {
			
			throw new NumberFormatException();
			
		}
						
	}
}
