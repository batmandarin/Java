package day07;

public class Class8 {
	public static void main(String[] args) {
		//객체화 : 클래스명 객체명 = new 클래스명();
        Class8Ex ST = new Class8Ex();
        //클래스명 객체명 = new 생성자(); == 위에 문단 구조
        ST.go();
        }
}

class Class8Ex{
	
	private String str1;
	//생성자 : 객체화를 하는 순간 무조건 사용되는 함수
	Class8Ex(){  //이게 생성자 맞음 ㅋㅋ
		setStr1("안녕하세요");
	}
	//get : 사용
	public String getStr1() {
		return str1;
	}
    //set : 대입
	public void setStr1(String str1) {
		this.str1 = str1;
	}//set 다음 get이 순서에 맞음

	public void go() {   //main()
	    System.out.println(getStr1());
	
	}
}

