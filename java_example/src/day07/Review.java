package day07;

public class Review {
	public static void main(String[] args) {
		ReviewClass rrr = new ReviewClass();
		rrr.go();
	}
}

class ReviewClass{
	private int num[] = {2,3,4,5};
	public void go() {
		System.out.println("객체화 성공");
		numChange();  //함수형 프로그래밍
		numselect();//메서드사용
	}
	//메서드정의
	public void numChange() {
		//배열에 값 대입
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
	}
	
	public void numselect() {
		//배열을 전부 보기
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		}
	}

