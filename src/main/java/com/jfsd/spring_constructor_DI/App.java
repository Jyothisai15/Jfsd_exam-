package com.jfsd.spring_constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Employee e= (Employee) context.getBean("emp1");
    	
    	System.out.println(e);
        
      		   
    
    }
}
