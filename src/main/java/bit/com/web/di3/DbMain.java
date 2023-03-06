package bit.com.web.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DbMain {
	
	//context=dom(document object model) (xml)
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/bit/com/web/di3/db.xml");
		System.out.println(context.getBean("systemServer"));
	}
	
	
}
