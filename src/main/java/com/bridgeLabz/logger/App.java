package com.bridgeLabz.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	 static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
        Layout layout = new PatternLayout("%d %M %C %m %n");
        Appender appender = new FileAppender(layout, "Applog.log");
        logger.addAppender(appender);
        logger.debug("debug priority");
        logger.info("info priority");
        logger.warn("warn priority");
        logger.error("error priority");
        logger.fatal("free priority");
    }
}
