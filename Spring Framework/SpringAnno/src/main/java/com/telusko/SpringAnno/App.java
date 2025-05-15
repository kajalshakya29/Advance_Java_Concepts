package com.telusko.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
	    // Initialize the application context
	    ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	    // Refresh the context to ensure proper initialization
	    //factory.refresh();
	    
	    // Access the bean from the context
	    Samsung s7 = factory.getBean(Samsung.class);
	    s7.config();
	    
	    // Close the context when done
	    //factory.close();
	}
}
