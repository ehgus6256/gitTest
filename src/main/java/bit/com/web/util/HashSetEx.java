package bit.com.web.util;

import java.util.HashSet;

public class HashSetEx {
	
	public void makerEx1() {
		String str[]= {"Java","Oracle","Spring","Spring","Jsp","Servlet","Java"};
		HashSet<String> set1=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		
		for(int i=0 ; i<str.length ; i++) {
			if(!set1.add(str[i])) {//중복이면?
				set2.add(str[i]);  //중복된 데이터를 set2에 넣어라
			}//if문
		}//for문
		//System.out.println(set1.toString());
		//System.out.println(set2.toString());
		HashSet<String>set3=(HashSet<String>)set1.clone();  //downcast
		HashSet<String>set4=(HashSet<String>)set2.clone();
		System.out.println(set1);
		System.out.println(set3);
		System.out.println(set4);
		
	}
	
	
	public static void main(String[] args) {
		HashSetEx h=new HashSetEx();
		h.makerEx1();
	}
	

}
