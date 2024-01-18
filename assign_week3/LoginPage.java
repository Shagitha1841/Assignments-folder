package assign_week3;

public class LoginPage extends BasePage_OverRide {
	@Override
	public void findElement() {
		System.out.println("Find the Element");
	}
	@Override
	public void performCommonTasks() {
		System.out.println("CommonTask is Ready to perform");
		
	}

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.findElement();
		login.performCommonTasks();
		login.clickElement();
		login.enterText();
		
		
	}

}
