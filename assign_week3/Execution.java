package assign_week3;

public class Execution  extends Button{

	public static void main(String[] args) {
		 Execution exe = new Execution();
		 exe.setText("Execution");
		 exe.click();
		 exe.submit();
		 
		 
		 Button but = new Button ();
		 but.setText("button");
		 but.click();
		 but.submit();
		 
		 
		 
		 ChecBox_Button chec = new ChecBox_Button ();
		 chec.setText("checBox_Button");
		 chec.click();
		 chec.clickCheckButton();
		 
		 chec.submit();
		 
		 RadioButton rad = new RadioButton ();
		 rad.setText("radioButton");
		 rad.click();
		 rad.selectRadioButton();
		 rad.submit();
		 
		 
		 TextField tex = new TextField ();
		 tex.setText("TextField");
		 tex.click();
		 tex.getText();
		 
		 
		 WebElement web = new WebElement();
		 web.setText("WebElement");
		 web.click();
		
		 
		 

	}

}
