package com.iu.lhj;

import static org.junit.Assert.*;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iu.mobile.Camera;
import com.iu.mobile.Phone;
import com.iu.mobile.Wifi;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class PhoneTest {
	
//	@Autowired
//	@Inject
	@Resource(name = "phone")
	private Phone phone;
	
	@Test
	public void makePhoneTest() {
//		Phone phone = new Phone();
//		Camera camera = new Camera();
		//setter를 이용한 주입
//		phone.setCamera(camera);		
		
		//생성자를 이용한 주입
//		phone = new Phone(new Camera(), new Wifi());
		
//		phone.getLgCamera().getInfo();
//		phone.getSamCamera().getInfo();
		
		phone.getLg().getInfo();
		phone.getSam().getInfo();
		
		//단정문
		assertNotNull(phone);
	}
}
