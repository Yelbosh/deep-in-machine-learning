package com.yelbosh.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Log4j工具类
 * @author Yabo
 *
 */
public class LoggerUtil {
	
	public static Logger getLogger(Class className){
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
    	Logger logger = Logger.getLogger(className);
    	return logger;
	}
	
}
