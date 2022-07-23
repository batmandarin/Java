package day08;
public class day08 {
	
//public class : 한 파일당 하나만 존재할 수 있음
public class Review {
	//main 함수 : 실행시 프로그램의 시작점
}
	public static void main(String[] args) {
		ReviewClass GX = new ReviewClass();
		GX.go(); //GX안에 있는 go를 실행시키는 것
		//Review2도 객체화
		Review2 TX = new Review2();
		System.out.println(TX.myString());
	}
}
//class : 반, 꾸러미 (변수 + 함수)
class ReviewClass{
	private String str;
	public String myString() {
		System.out.println("myString함수 실행");
		return "문장"; //무조건 리턴으로 스트링 값을 넘겨줘야함
		//return 뒤의 코드 : 죽은 코드, 실행되지 않음
	}
	public void go() {
		 str = myString();
		 System.out.println(str);
	}
}

//extends : 클래스를 복사 붙여넣기
class Review2 extends ReviewClass{  //상속 대상인 Review2는 이미 만들어짐
	//ReviewClass의 코드가 복사붙여넣기 되어있음
	//추가
	private int num = 10;
	public int myNum() {
		System.out.println(num);
		return num;
	}
	//수정 (오버라이딩, 재정의)
	public String myString() {
		return "수정한 mtString함수";
	}
}