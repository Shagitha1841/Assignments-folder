package assign_week3;

public class Java2_Connec extends MySql_Connect{

	

	public void executeUpdate() {
		System.out.println("Update Execution---Java2_Connection");
	}

	@Override
	public void executeQuery() {
		System.out.println("Query Executed---Java2_Connection");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java2_Connec java = new Java2_Connec();
		java.executeUpdate();
		java.executeQuery();
		java.connect();
		java.disConnect();
		

	}

}
