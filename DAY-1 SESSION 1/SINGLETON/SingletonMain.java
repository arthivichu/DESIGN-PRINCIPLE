public class SingletonMain {
	public static void main(String[] args) {
		DBConn dbConn = DBConn.getInstance();
		
		System.out.println(dbConn.displayStr);
	}

}