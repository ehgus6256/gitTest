package bit.com.web.di1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/bit/com/web/di1/person.xml");
		/* ((Person)context.getBean("person1")).setName("최남이"); */
		/* context.getBean("person1"); */
		PersonCollection pc=(PersonCollection)context.getBean("pc");
		
		//for(Person st:pc.getList()) {
		//	System.out.println(st);
		//}
		
		
		//Iterator<Entry<Integer, Person>>iter= pc.getMap().entrySet().iterator();
		//while(iter.hasNext()) {
		//	Entry<Integer, Person>entry=iter.next();
		//	System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		//}
		
		//Iterator<Person>i=pc.getSet().iterator();
		//while(i.hasNext()) {
		//	Person node=i.next();
		//	System.out.println(node);
		//}
		
		//for(Person p:pc.getSet()) {
		//	System.out.println(p);
		//}
		
		//System.out.println(pc.getProperties());
		//for(Object o: pc.getProperties().keySet()) {
		//	System.out.println(o);
		//}
		
		
		Enumeration<Object>e=pc.getProperties().elements();  //value를 반환하는 메소드
		Properties ps=pc.getProperties();
		while(e.hasMoreElements()) {
			Object nodekey=e.nextElement();
			System.out.println(nodekey);					
		}
		
		Iterator<Entry<Object, Object>>iter= pc.getProperties().entrySet().iterator();
		
		for(;iter.hasNext();) {
			Entry<Object, Object> entry=iter.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
		
		
		
		
		
		
	}

}
