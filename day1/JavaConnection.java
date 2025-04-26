package week4.day1;

public class JavaConnection implements DatabaseConnection {
	

	

	@Override
	public void connect() {
		System.out.println("Database has Coonected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Database has Disconnected");
		
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Database has executeUpdate");
		
	}
	
	public static void main(String[] args) {
		JavaConnection connection = new JavaConnection();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		

	}

}
