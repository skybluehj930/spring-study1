package com.iu.mobile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	//상속 
	// 자식명  is a 부모명
	
//	@Resource(name = "lgCamera")
//	private Camera lgCamera;
//	@Resource(name = "samCamera")
//	private Camera samCamera;
	
//	public LgCamera getLgCamera() {
//	return lgCamera;
//}
//public void setLgCamera(LgCamera lgCamera) {
//	this.lgCamera = lgCamera;
//}
//public SamCamera getSamCamera() {
//	return samCamera;
//}
//public void setSamCamera(SamCamera samCamera) {
//	this.samCamera = samCamera;
//}
	
	@Autowired
	@Qualifier("lgCam")
	private Camera lg;
	@Autowired
	@Qualifier("samCam")
	private Camera sam;
	public Camera getLg() {
		return lg;
	}
	public void setLg(Camera lg) {
		this.lg = lg;
	}
	public Camera getSam() {
		return sam;
	}
	public void setSam(Camera sam) {
		this.sam = sam;
	}
	
	@PostConstruct //생성후
	public void init() {
		System.out.println("객체 생성후 초기화 메소드");
	}
	
	@PreDestroy //소멸전
	public void destroy() {
		System.out.println("객체 소멸전 메소드");
	}

	/*
	public Phone() {
		
	}
	
	public Phone(Camera camera, Wifi wifi) {
		this.camera = camera;
		this.wifi = wifi;
	}
	
	//포함 
	// 자식명 has a 부모명
//	@Autowired //객체 type기준으로 주입
//	@Inject //java에서 제공하는 객체 주입
	@Resource(name = "camera") //이름을 가지고 객체 주입
	private Camera camera;
//	@Autowired
//	@Inject
	@Resource(name = "wifi")
	private Wifi wifi;
	
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Wifi getWifi() {
		return wifi;
	}
	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}
	
	*/
}
