package assign_week3;

public class Login_TestData extends Test_Data{

	
	public void enterUserName() {
		System.out.println("UserName : shahitha ");
	}
	
	public void enterPassword() {
		System.out.println("PassWord : 1234567");
	}
	public static void main(String[] args) {
		
		Login_TestData log = new Login_TestData();
		Test_Data tes = new Test_Data();
		tes.enterCredentials();
		tes.navigateToHomePage();
		log.enterUserName();
		log.enterPassword();
		log.enterCredentials();
		log.navigateToHomePage();
		

	}

}
