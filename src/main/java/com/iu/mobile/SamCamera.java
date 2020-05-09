package com.iu.mobile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("samCam")
public class SamCamera extends Camera{
	
	@Override
	public void getInfo() {
		System.out.println("삼성 카메라");
	}
}
