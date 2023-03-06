package bit.com.web.di4;

import java.util.Enumeration;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemoMain {
	
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigDemo.class);
		System.out.println(context.getBean("getDmlServer"));
		System.out.println(context.getBean("stateServer"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("book1"));
		System.out.println(context.getBean("getMap"));
		System.out.println(context.getBean("getProperties"));
		Properties p=(Properties)context.getBean("getProperties");
		Enumeration<Object>e= p.keys();
		System.out.println(e);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
}
