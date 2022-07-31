package day12;

import java.util.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Review {
	public static void main(String[] args) {
		//R1 객체화
		//go 매서드 사용
		R1 r1 = new R1();
		r1.go();
		
		R2 r2 = new R2();
		r2.go();
		
		R3 r3 = new R3();
		R3.go(10,0);   //10/0
		
		//자바는 Object클래스를 항상 상속받아 있음.
		//자바의 각종 기능은 Object라는 클래스 안에 구현이 되어있음
		//
		
	}

}
