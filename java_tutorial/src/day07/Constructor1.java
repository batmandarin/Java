package day07;

public class Constructor1 {
	public static void main(String[] args) {
		Cst1 c1 = new Cst1("제네시스", 7777);
		//클래스명 객체명 = new 생성자명을 우선 해야하니 아까 생성자 식 쓸때 오류난 것
		c1.go();
		
		Cst1 아버지차 = new Cst1("audiA7", 7777);
				아버지차.go();
	}
}//setter가 먼저 getter가 나중

class Cst1{
	private String car_name;
	private int car_num;
	
	//생성자
	Cst1(String car_name, int car_num){
		setCar_name(car_name);
		setCar_num(car_num);
	}//main : 시작함수
	//set = 대입할 때 사용/ get = 사용할 때 사용
	public void go() {
		carInfo();
	//변수에 대해서만 getter setter를 하는 것 
	}
	
	public void carInfo() {
		System.out.println("차종은 "+getCar_name()+", 차번호는 "+getCar_num());
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public int getCar_num() {
		return car_num;
	}

	public void setCar_num(int car_num) {
		this.car_num = car_num;
	}
	
	
}
