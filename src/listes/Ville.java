package listes;

public class Ville {
	
		private String nom = null;
		private int nbreHabitants = 0;
		
				
		public Ville(String nom, int nbreHabitants) {
			super();
			this.nom = nom;
			this.nbreHabitants = nbreHabitants;
		}
		
		public String getNom() {
			return nom;
		}
		
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public int getNbreHabitants() {
			return nbreHabitants;
		}
		
		public void setNbreHabitants(int nbreHabitants) {
			this.nbreHabitants = nbreHabitants;
		}

		@Override
		public String toString() {
			return "Ville [nom=" + nom + ", nbreHabitants=" + nbreHabitants + "]\n";
		}

		
		
}
