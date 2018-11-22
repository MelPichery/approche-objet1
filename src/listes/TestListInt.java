package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
				
		
		for (int i = 0; i < list.size(); i++) {
			
			int maValeur = list.get(i) ;			
			
			System.out.print(maValeur+"  ");
	
		}
		
		Object obj1 = Collections.max(list);
		Object obj2 = Collections.min(list);
		
		System.out.println();
		System.out.println("La valeur max est : "+obj1);
		System.out.println("La valeur min est : "+obj2);
		
		list.remove(obj2);
		
		for (int i = 0; i < list.size(); i++) {
			
			int maValeur = list.get(i) ;			
			
			if (maValeur<0) {
				
				maValeur = -maValeur;
				
			}
																
			System.out.print(maValeur+"  ");
	
		}
		
		
	}

}
