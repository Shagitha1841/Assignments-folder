package assign_week3.day2;

public class Oddindex_Upper {

	public static void main(String[] args) {
		
		String str = "username";
		int len = str.length();
		char[] charArray = str.toCharArray();
		for(int i=0;i<len;i++) {
			if(i%2==1) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			}
		}

	}

}
