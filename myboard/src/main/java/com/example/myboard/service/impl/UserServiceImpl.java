package com.example.myboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myboard.model.User;
import com.example.myboard.repository.UserRepository;
import com.example.myboard.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    //클래스명 impl에 상속하고 추가적인 함수들도 재정의
	@Autowired
	private UserRepository user;
	
	public UserServiceImpl(UserRepository user) {
		super();
		this.user = user;
	}
	//jpa = 자바 전용 데이터베이스
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return user.findAll();  //상속받은 인터페이스의 함수를 오버라이딩
	}
	
}
