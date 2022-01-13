package homework;

public class SpacedLogger implements Logger	{
	
	@Override
	public void Log(String Log) {
		String phrase = Log;
		for (int j = 0; j < phrase.length(); j++) {
			System.out.print(phrase.substring(j, j+1) + " ");
			
		}
		System.out.println("");
	}

	@Override
	public void Error(String Error) {
		String phrase = Error;
		System.out.print('\n' + "ERROR: ");
		for (int j = 0; j < phrase.length(); j++) {
			System.out.print(phrase.substring(j, j+1) + " ");
		
	}
		System.out.println("");
}
}