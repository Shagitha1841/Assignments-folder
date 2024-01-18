package assign_week3;

public class Polymorphism {

	
	public void reportStep(String msg , String status)
	{
		
		
		System.out.println("Report Step--1");
		System.out.println("Message = " +msg);
		System.out.println("Status =" +status);
		
	}
	
	public void reportStep(String msg , String status , boolean snap) {
		System.out.println("Report Step--2");
		System.out.println("Message = " +msg);
		System.out.println("Status =" +status);
		System.out.println("boolean = " +snap);
		
	}
	public static void main(String[] args) {
		
		Polymorphism poly = new Polymorphism();
		poly.reportStep("hello","In-Progress");
		poly.reportStep("TestLeaf", "Done", true);
		

	}

}
