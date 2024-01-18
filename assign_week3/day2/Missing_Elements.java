package assign_week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missing_Elements {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(0);
		list.add(2);
		list.add(5);
		list.add(12);
		list.add(14);
		list.add(1);
		Collections.sort(list);

		System.out.println("Sorted Nmber list :" +list);
		int j = list.get(0);
		int k = list.get(list.size()-1);
		System.out.println("Missing Numbers in list:");
		for(int i=j+1;i<k;i++ ) {
			if(!list.contains(i)) {
				System.out.println(+i);
			}
		}
	}

}
