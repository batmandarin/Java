package day05;

public class Class3 {
	public static void main(String[] args) {
		//클래스 안에서 클래스를 사용하기 위해선 변수로 만들어준다(객체화)
		Car 봉고차 = new Car(); // 객체 : object(대상, 출력할 물체),  클래스 : Class(반배치, 추상적)
		Car 스포츠카 = new Car();
		Car 내차 = new Car();
		Car 법인차 = new Car();
		Car 중고차 = new Car(); //wsndrhc 중고차 등의 ㄱ개체 이름ㄴ에 또 이름 붙여서 객체화와 구분을 더 명확히 함
		//null비어있는칸의미고걍 앞에 입력코드대로 입력할 거 대략 몇개인지만 알려주는 용도 ㅇㅇ 별로 중요하지 않음..
		봉고차.차정보입력("블랙","스타렉스","현대");
		스포츠카.차정보입력("레드","부가티","마력최상");
		내차.차정보입력("블루","쏘렌토","2미터");
		법인차.차정보입력("화이트","아반떼","르노삼성");
		중고차.차정보입력("오렌지","K5","직불");
		
	    System.out.println(봉고차.차정보출력());
	    System.out.println(스포츠카.차정보출력());
	    System.out.println(내차.차정보출력());
	    System.out.println(법인차.차정보출력());
	    System.out.println(중고차.차정보출력());
	    
	    Human 박석호 = new Human();
		Human 신격호 = new Human();
		Human 저우량 = new Human();
		Human 김정현 = new Human();
		//스트링은 이런 입력 구조에서 절대 플러스도 콤마 없이 그대로 쓷거나 아예 끝문ㅋ단에도 입력하는 등 할 수 없다.
		박석호.정보입력("박석호" , "남자" , "18" , "179");
		신격호.정보입력("신격호"+"ㅎㅎ" , "남자" , "43" , "175");
		저우량.정보입력("저우량" , "남자", "28" , "180");
		김정현.정보입력("김정현" , "남자" , "30" , "173");
		System.out.println(박석호.정보출력());
	    System.out.println(신격호.정보출력());
	    System.out.println(저우량.정보출력());
	    System.out.println(김정현.정보출력());
	    
	}
}

class Car{
	String color;
	String onwer_name;
	String Car_name;
	
	void 차정보입력(String 색상, String 주인, String 차이름) {
		color = 색상;
		onwer_name = 주인;
		Car_name = 차이름;
	}
	
	String 차정보출력() {
		return "이 차의 주인은"+onwer_name+"차의 이름과 색깔은"+Car_name+color;
	}
}//다른 클래스는 무조건 클래스 밖에 또 메인 중심으로 또 스트링으로 구조화 
//Human : 이름, 성별, 나이, 키
class Human{
	String 이름;
	String 성별;
    String 나이;
	String 키;//디스가 없고 또 스트링 입력칸 함수칸에 값전달이 안되니 눌이 나온 것. 그냥 아무것도 안 넣는 작업을해서그럼
	
	void 정보입력(String 이름, String 성별, String 나이, String 키) {
		this.이름 = 이름;  //디스 점을 붙이면 클래스에 있는걸 사용
	
		this.성별 = 성별;
		this.나이 = 나이;
		this.키 = 키;
	}
	
	String 정보출력() {
		return 이름+"의 정보 : "+이름+성별+나이+키;
	}
}