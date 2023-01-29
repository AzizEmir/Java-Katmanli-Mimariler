package Logger;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void Log(String data) {
		System.out.println("Database ile loglandi : " + data);
		
	}

	@Override
	public void Log(int data) {
		// TODO Auto-generated method stub
	}

}
