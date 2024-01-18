package assign_week3.day2;

public class Duplicate_Word {

	public static void main(String[] args) {
		 String dupli = "hello!! welcome to java world learn new things";
		 String Str[] =dupli.split(" ");
		 
		 String ans = "";
		 for(int i=0;i<Str.length;i++) {
			 
			 for(int j=i+1;j<Str.length;j++) {
				 if(Str[i].equalsIgnoreCase(Str[j])) {
					 Str[j] = "cancel";
					 
				 }
			 }
			 
		 }
		 
		 for(String wrd : Str) {
			 if(wrd != "cancel") {
				 ans = ans+wrd +" ";
			 }
		 }
		 
		 System.out.println("remove Duplicate Word :" +ans);

		 
	}

}
