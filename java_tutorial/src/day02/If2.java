package day02;

public class If2 {
	public static void main(String[] args) {
		//버스를 탔습니다
		//카드를 찍습니다
		//나이에 따라서 멘트를 다르게 해주세요
		//나이가 20 이상이면 성인, 14에서 19이면 청소년, 14 미만이면 어린이로 출력 
		 int 나이 = 4;
		 
		 if (나이 >= 20) {
			System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"성인입니다.");
		 }
		 //int dr = 15;
		 
		 if ((나이 >=14 && 나이 <=19)) {
			 System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"청소년입니다.");
		 }
		 //int ㄽㅎ = 9;
		 
		 if (나이 < 14) {
			 System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"어린이입니다.");
		 }
		 
	}
}
