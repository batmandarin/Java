package com.example.Myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {
	@GetMapping("/")    //localhost:8084/ 입력하면 
	public String indexPage( ) {
		return "index";  //index.html 파일을 열어라
	}

}
