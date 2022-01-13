package homework;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		System.out.println("");
		
	}

	@Override
	public void Error(String Error) {
		System.out.println("*****************************" + '\n' + '\n' + "Error: " + Error + '\n' + '\n' + "*****************************");
		System.out.println("");
		
	}

}
