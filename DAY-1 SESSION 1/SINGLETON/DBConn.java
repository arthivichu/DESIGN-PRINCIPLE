public class DBConn {
	
	//instance variable 
	private static DBConn instance = null;
	
	public String displayStr;
	//constructor 
	private DBConn() {
		
	}
	public static DBConn getInstance() {
		if(instance == null) 
			instance = new DBConn();
		
		return instance;
	}
}