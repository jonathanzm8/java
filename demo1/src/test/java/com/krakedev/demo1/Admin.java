package com.krakedev.demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private  static Logger logger= LogManager.getLogger();
	
	public void agregar() {
		logger.warn("imesaje warn ");
		logger.info("imesaje info ");
		logger.debug("imesaje debug ");
		logger.trace("imesaje tracer ");
		
		logger.error("imesaje error");
	}

}
