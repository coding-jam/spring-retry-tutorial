package it.cosenonjaviste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(RetryApplicationContext.class);
    	
    	ExchangeRateCalculator dummyRateCalculator = (ExchangeRateCalculator) context.getBean("dummyRateCalculator");
    	ExchangeRateCalculator advancedDummyRateCalculator = (ExchangeRateCalculator) context.getBean("advancedDummyRateCalculator");
    	ExchangeRateCalculator realRateCalculator = (ExchangeRateCalculator) context.getBean("realRateCalculator");
    	
    	System.out.println("--- dummyRateCalculator ---");
    	System.out.println("Return value " + dummyRateCalculator.getCurrentRate());
    	
    	System.out.println("--- advancedDummyRateCalculator ---");
    	System.out.println("Return value " + advancedDummyRateCalculator.getCurrentRate());
    	
    	System.out.println("--- realRateCalculator ---");
    	System.out.println("Return value " + realRateCalculator.getCurrentRate());
    }
}
