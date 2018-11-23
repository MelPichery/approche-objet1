package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		
		//tri croissant sur le nombre d'habitants
		return o1.getNbreHabitants().compareTo(o2.getNbreHabitants());
		
	}

}
