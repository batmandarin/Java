package day05;

import day01.Syso1;

public class Class2 {
	String 변수;
	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		mc.add(1, 2);
		mc.sub(3, 4);
		//더하기 하려면 add, 빼기하려면 sub 서브틀, 곱하기하려면 mul, 나누기하려면 div
		
		//데한민국 GPS좌표구하기(삼성에서 시킴)-당장 할수 있나?(과외샘 질문)-ㅈㄴ어렵죠당연
		//-_인수를 활용햐ㅐ 인수인계 어떰?? - 좌표를 mc, int로 활용해 입력??? -> ㄴㄴ => ex-독도, 경도 구하는 공식
		//사수 - 귀찮다 함 - 내 시간 아깝고 알려주기도 싫고 나만의 기술을 공개하기도 싫다함 -알아서 다 하라는 거네? 
		//준비한 것도 없어보이면서 ㅆ새
	  //-> 대책 - 클래스만 만들어서 사용 방법을 알려주긴 함 - 사수놈 기본적인 것만 해줬네. 기본도 안되있다 생각하나 날?
		mc.div(4, 2);
		
		//클래스겸 변수명 = new 클래스명();함수명 선언 꼭 해줘야 함 ==객체명(클래스를 변수로 만듬)
		MyStr 변수 = new MyStr();
		변수.saveprint("hello");
		변수.myPrint();
	    System.out.println("asd");
		//위에 예도 내부 코드는 생각보다 복잡함
		//클래스만 활용하고 함수 자체를 안 다루고 지원도 안 하는 사람은 초보 ㅇㅇ
		
	}
}

//클래스 : 함수+변수
//메서드 : 클래스 안에 있는 myclass안에 사칙연산 기능
class MyClass2{
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	
	}
	
	void sub(int n1, int n2) {
		System.out.println(n1+n2);
	
		
	}
	
	void mul(int n1 , int n2) {
		System.out.println(n1*n2);
	}
	
	void div(int n1, int n2) {
		System.out.println(n1/n2);
	}
}

class MyStr{
	String str = "";
	void myPrint() {
		System.out.println(str);
	}
	void saveprint(String in) {
		str = in;
	}
}
