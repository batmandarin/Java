package day11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time1 {
	public static void main(String[] args) {
		
	}
}

class NowTime{
	public void go() {
		//main 
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdfl = new SimpleDateFormat("yyyy년 mm월 dd일 HH시 mm분 ss초");
		System.out.println(sdfl.format(date));
		
		SimpleDateFormat sdfl2 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdfl3 = new SimpleDateFormat("mm");
		System.out.println(sdfl2.format(sdfl)+"년");
		System.out.println(Integer.parseInt(sdfl.format(date))+"월");
	    System.out.println(sdfl2.format(date)+"년" + Integer.parseInt(sdfl.format(date))+"월");
		
	}
	public void go2() {
		String year = 
		String Name = 
		//Integer.parseInt로 문자열을 함수로 바꿔서 이야기
		
	}
}
