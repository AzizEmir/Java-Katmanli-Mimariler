package Logger;

public class FileLogger implements BaseLogger{

	@Override
	public void Log(String data) {
		System.out.println("File ile loglandi : " + data);
		
	}

	@Override
	public void Log(int data) {
		// TODO Auto-generated method stub
		
	}

}
