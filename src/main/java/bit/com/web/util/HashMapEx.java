package bit.com.web.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public void methodEx1() {
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "딸기");
		map.put(1, "수박");  //딸기 없어짐
		map.put(2, "수박");
		map.put(3, "멜론");
		map.put(5, "키위");  //숫자 순서 상관무
		
		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		for(;it.hasNext();) {
			Entry<Integer, String>entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		//Set<Integer> set=map.keySet();
		//Iterator<Integer>iter=set.iterator();   //  반복자/set에 있는 key값을 반복
		//while(iter.hasNext()) {
		//	int i=iter.next();
		//	System.out.println("key:+"+i+" value:"+map.get(i));
		//}
		
		
		/*
		 * System.out.println(map.get(2)); //2번(수박) 빠짐
		 * System.out.println(map.containsKey(1)); //키값에 1번이 있으면 true 없으면 false
		 * System.out.println(map.containsValue("키위")); //밸류값에 키위가 있으면 true 없으면 false
		 */		
		
		
		
		
		//System.out.println(map);
			
	}
	
	
	
	public static void main(String[] args) {
		HashMapEx hp=new HashMapEx();
		hp.methodEx1();
	}
	
}
