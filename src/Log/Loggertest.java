package Log;

public class Loggertest {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
	}

}
