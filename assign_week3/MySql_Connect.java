package assign_week3;

public abstract class MySql_Connect implements DataBase_Connec{
	
	public void connect() {
		System.out.println("connected--- Mysql");
	}
	
	public void disConnect() {
		System.out.println("dis-connect---MySql");
	}
	
	public abstract void executeQuery();

}
