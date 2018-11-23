package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		
		//Tri croissant sur le pib/habitant
		return o1.getPibParHabitant().compareTo(o2.getPibParHabitant());
	}

}
