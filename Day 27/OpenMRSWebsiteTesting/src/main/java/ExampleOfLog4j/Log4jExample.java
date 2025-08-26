package ExampleOfLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jExample {
	 private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4jExample.class);
	 
	   public static void main(String[] args) {
	      logger.trace("This is a TRACE log");
	      logger.debug("This is a DEBUG log");
	      logger.info("This is an INFO log");
	      logger.warn("This is a WARN log");
	      logger.error("This is an ERROR log");
	      logger.fatal("This is a FATAL log");
	   }

}
