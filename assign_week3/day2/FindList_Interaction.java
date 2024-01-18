package assign_week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindList_Interaction {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(1);
		
		List<Integer>  list1 = new ArrayList<Integer>();
		
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		for(int i=0;i<list.size();i++) {
			if(list1.contains(list.get(i)) == (false)) {
				list.remove(i);
			}
		}
        System.out.println(list + "");
		
	}

}
