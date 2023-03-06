package bit.com.web.di4;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import bit.com.web.di1.Person;

@Configuration
@ImportResource({"bit/com/web/di1/person.xml","bit/com/web/di2/book.xml"})
public class ConfigDemo {
	
	@Bean(name = "stateServer")
	public StateServer getStateServer() {
		return new StateServer("http://lacalhost:8181", 5000, "ORACLE", "BLUE", "1234");
	}
	@Bean
	public DmlServer getDmlServer() {
		return new DmlServer(new StateServer("http://211.132.56.9:8181", 3000, "Mysql", "SCOTT", "TIGER"));
	}
	
	@Bean
	public Map<Integer, Person>getMap(){
		HashMap<Integer, Person>map=new HashMap<Integer, Person>();
		map.put(1, new Person("aaa"));
		map.put(1, new Person("bbb"));
		map.put(1, new Person("ccc"));
		return map;
	}
	
	@Bean
	public Properties getProperties() {
		Properties p=new Properties();
		p.put("a", new Person("aa"));
		p.put("b", new Person("bb"));
		p.put("c", new Person("cc"));
		return p;
	}
	
	
	

}
