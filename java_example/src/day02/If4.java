package day02;

public class If4 {
	public static void main(String[] args) {
		int 나이 = 25;
		 
		 if (나이 >= 20) {
			 // 20이상
			System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"성인입니다.");
		 }
		 //int dr = 15;
		 
		 else if ((나이 >=14)) {
			 //14 이상 20 미만
			 System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"청소년입니다.");
		 }
		 //int ㄽㅎ = 9;
		 
		 else if (나이 < 14) {
			 //14 미만
			 System.out.println("버스를 탔습니다 : "+"카드를 찍습니다 : "+"어린이입니다.");
		
		}
		 else {
			 System.out.println("그 밖에 나머지");
		 }
		 //얘네 세트가 끝난 위치로 여기로 오게 된다 
		 
		 //퀴즈 : 성적 매기기 
		 //90 이상이면 S, 80 이상이면 A, 70 이상이면 B, 그 이하는 다 F
		 int score = 100;
		 //else if는 무조건 if랑 같이 쓰여야함 ifa만 있으면 다들 따로따로 작동되는데 
		 //만약 else if를 스면 if의 조건에 안 맞는 값이 입렫ㄱ된 견ㅇ우 또다른 if로서 작동함
		 if (score >= 90) {
			 System.out.println("S");
		 }
		 else if (score >= 80) {
			 System.out.println("A");
		 }
		 else if (score >= 70) {
			 System.out.println("B");
		 }
		 else {
			 System.out.println("F");
		 }
	}

}
