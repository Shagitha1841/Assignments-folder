package assign_week3;

public class Java_Connect  implements DataBase_Connec{

	

	public void connect() {
		System.out.println("connected");
		
	}

	public void disConnect() {
		System.out.println("Dis-Connected");
		
	}

	public void executeUpdate() {
		System.out.println("Execution Update");
		
	}
	
	public static void main(String[]args) {
		Java_Connect jav = new Java_Connect();
		jav.connect();
		jav.disConnect();
		jav.executeUpdate();
	}
		
	}


