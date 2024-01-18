package assign_week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sec_LargeNum {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(8);
		list.add(20);
		list.add(15);
		Collections.sort(list);
		System.out.println("ASCII list of num :" + list);
		System.out.println(list.get(list.size()-2));
		
		

	}

}
