package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {
	private static Logger logger;

	public static Logger getLogger(Class<?> className) {
		if (logger == null) {
			logger = LogManager.getLogger(className);
		}
		return logger;
	}
}
