package day08;
public class Inter1ITmpl extends MyClass implements Inter1{//클래스2개를 동시에 상속받는건 자바가 허용 안함
	//MyClass가 여기에 복사 붙여넣기 됨
	//인터페이스를 상속(지정)받으면 인터페이스의 함수를 모두 완성해줘야함
	//implements라는 것으로 상속을 받고 클래스에 빨간밑줄이 가면 마우스를 올려준다
	//Add unimplemented methods 라는 것을 클릭해서 오버라이딩(재정의, 수정)한다.
	public static void main(String[] args) {
		//static : 우선순위가 높아서 this. 등으로 접근이 안됨
		Inter1ITmpl impl = new Inter1ITmpl();
		impl.go();
		
		//interface를 왜 상속받냐
		Inter1 inter1 = new Inter1ITmpl();  //자료형을 인터페이스로 통일할 수 있음 : 다형성
		inter1.go();
		
		Inter1 inter2 = new MyClass();
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상속 성공");
	}//todo가 나오는 것이 재정의 과정 대개 go로 시작함 인터페이스 상속이 되는 과정임

}

class MyClass implements Inter1{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyClass2{
	
}

interface MyInter{
	
}