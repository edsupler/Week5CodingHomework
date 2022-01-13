package homework;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.Log("Look at all these stars");
		logger.Error("Stars above and below!");
		
		logger2.Log("Much Space WOW!");
		logger2.Error("Bananas in pajamas");
		
	}

}
