package bit.com.web.di1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonCollection {
	private List<Person>list;  //순서가 있고 중복허용
	private Map<Integer, Person>map;  //key|value로 구성
	private Set<Person>set;  //순서가 없고 중복불허
	private Properties properties;   //map과 유사함
	
	

	public PersonCollection() {
		super();
	}

	
	public Properties getProperties() {
		return properties;
	}


	public void setProperties(Properties properties) {
		this.properties = properties;
	}


	public Set<Person> getSet() {
		return set;
	}
	
	
	
	public void setSet(Set<Person> set) {
		this.set = set;
	}

	public PersonCollection(List<Person> list) {
		super();
		this.list = list;
	}



	public List<Person> getList() {
		return list;
	}



	public void setList(List<Person> list) {
		this.list = list;
	}



	public Map<Integer, Person> getMap() {
		return map;
	}



	public void setMap(Map<Integer, Person> map) {
		this.map = map;
	}
	
	
	

}
