package bit.com.web.di1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonCollection {
	private List<Person>list;  //������ �ְ� �ߺ����
	private Map<Integer, Person>map;  //key|value�� ����
	private Set<Person>set;  //������ ���� �ߺ�����
	private Properties properties;   //map�� ������
	
	

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
