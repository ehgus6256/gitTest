package bit.com.web.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public void methodEx1() {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "����");
		map.put(1, "����");  //���� ������
		map.put(2, "����");
		map.put(3, "���");
		map.put(5, "Ű��");  //���� ���� �����
		
		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		for(;it.hasNext();) {
			Entry<Integer, String>entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		//Set<Integer> set=map.keySet();
		//Iterator<Integer>iter=set.iterator();   //  �ݺ���/set�� �ִ� key���� �ݺ�
		//while(iter.hasNext()) {
		//	int i=iter.next();
		//	System.out.println("key:+"+i+" value:"+map.get(i));
		//}
		
		
		/*
		 * System.out.println(map.get(2)); //2��(����) ����
		 * System.out.println(map.containsKey(1)); //Ű���� 1���� ������ true ������ false
		 * System.out.println(map.containsValue("Ű��")); //������� Ű���� ������ true ������ false
		 */		
		
		
		
		
		//System.out.println(map);
			
	}
	
	
	
	public static void main(String[] args) {
		HashMapEx hp=new HashMapEx();
		hp.methodEx1();
	}
	
}
