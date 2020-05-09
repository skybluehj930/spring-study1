package com.iu.mobile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lgCam") //LgCamera lgCam = new LgCamera();
public class LgCamera extends Camera {

	@Override
	public void getInfo() {
		System.out.println("LG 카메라");
	}
}
