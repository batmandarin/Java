package day08;
public interface Inter1 {
	//상속 전용 클래스
	//Interface는 함수의 선언부만 존재
	final String str = ""; //사용만 가능한 변수(상수 final), 한번 값을 대입하면 바꿀 수 없음
	public void go(); //중괄호를 만들지 않음
	//인터페이스의 함수는 선언만 합니다. 그래서 {}가 없습니다.
	//선언만 된 메서드는 상속받은 클래스에서 반드시 구현해줘야함. {}부분

}
