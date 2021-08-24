package day17;

import java.util.ArrayList;
import java.util.HashMap;


class Test{
	private String test;
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return test;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
	/*	ArrayList<Test> tArr = new ArrayList<Test>();
		
		Test t = new Test();
		t.setTest("문자열");		// private이니까 setTest에 저장
		
		tArr.add(t);			// tArr은 Test자료형밖에 못쓰니까 t 저장
		
		Test a = tArr.get(0);	// 저장된 값을 가져올때는 Test형식의 변수를 지정*/
		
		HashMap<String, Test> map = new HashMap<String, Test>();
		map.put("111", t);
		t = new Test();
		t.setTest("안녕하세요");
		map.put("Hello", t);
		
	//	Test tt = map.get("111");
	//	tt.display;
	//	map.get("111").display();
		System.out.println(map.get("111").getTest());
		System.out.println(map.get("hello").getTest());
		
		
	}
}
