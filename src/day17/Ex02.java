package day17;

class Print02<T>{	// 오버로딩을 하나하나 안하고 한번에 클래스에 T를써서 자료형 지정 제네릭=가변적으로 자료형 부여
	public void test(T n1, T n2) {
		System.out.println(n1+","+n2);
	}

}


public class Ex02 {
	public static void main(String[] args) {
									// 자료형에 무슨 자료형을 쓸지 명시가능	
									// 클래스 자료형을 사용해야함 
									// 모두 첫문자 대문자, int = Integer, char = Character
		Print02<Double> dou = new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> str = new Print02<String>();
		str.test("aa", "bb");
		Print02<Integer> in = new Print02<Integer>();
		in.test(10, 20);
		
		
		

	}
	
}
