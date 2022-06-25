package com.example.Myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebApplication.class, args);
		System.out.println("Myweb 실행 완료");
	}

}


//frontend : 화면  네이버 로그인 호ㅓ ㅏ면 자체가 프론트  html,css,js
//backend : 기능 로그인 시도하건 ㅏ 오류났을 대 무슨 글 띄우는 거 는 백엔드(기능) : java 화면 자체는 안 만드나 화면 기능은 만듬
//database : 저장 (로그인 데이터, 기록) mysql, 