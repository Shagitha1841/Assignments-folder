package assign_week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_String {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("anu");
		list.add("sri");
		list.add("kamali");
		list.add("momo");
		list.add("suga");
		int size =list.size();
		System.out.println("Size of List :" + size);
		System.out.println("List of Student Names :" +list);
		Collections.sort(list);
		System.out.println("sorted list of student names :" +list );
		for(int i=size-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}

}
