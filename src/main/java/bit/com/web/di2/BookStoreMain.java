package bit.com.web.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookStoreMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/bit/com/web/di2/book.xml");
		System.out.println(context.getBean("Bs"));
		
		
		
	}
	
}
