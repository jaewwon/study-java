//캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것
//(외부의 접근으로부터 객체 보호)

//클래스(class) : 객체 모양을 선언한 틀(캡슐화)
//메소드(멤버 함수), 필드(멤버 변수)
//메소드의 정의 : 특정목적으로 자주 사용되는 명령을 함수로 정의

public class ValuePassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		increase(n);
		System.out.println(n);
		//10

	}
	
	static void increase(int m) {
		m = m + 1;
	}

}
