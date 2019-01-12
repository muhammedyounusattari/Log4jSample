package younus.attari;

import org.apache.log4j.Logger;

public class App {

	private static Logger LOG = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
//		AT-DIWEFO
		
		LOG.trace("this is from trace");
		LOG.debug("this is from debug");
		LOG.info("this is from info");
		LOG.error("this is from error");
		LOG.warn("this is from warn");
		
	}
}
