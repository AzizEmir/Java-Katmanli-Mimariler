package Logger;

public class MailLogger implements BaseLogger{

	@Override
	public void Log(String data) {
		System.out.println("Mail ile loglandi : " + data);
		
	}

	@Override
	public void Log(int data) {
		// TODO Auto-generated method stub
		
	}
	
}
