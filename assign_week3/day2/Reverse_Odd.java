package assign_week3.day2;

public class Reverse_Odd {

	public static void main(String[] args) {
		 String str = "Hi! I am Shahitha";
		 String[] s = str.split(" ");
		 String e =" ";
		 String h = "";
		 for(int i=0;i<s.length;i++) {
			 if(i%2==0) {
				 System.out.println(" " + s[i]+ " ");
			 }
			 else {
				 e = s[i];
			 }
			 
			 for(int j = e.length()-1;j>=0;j--) {
				 h= ""+e.charAt(j);
				 System.out.println(h);
			 }
			 e="";
		 }

	}

}
