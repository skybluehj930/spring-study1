package com.iu.lhj;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.crypto.dsig.keyinfo.PGPData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.mobile.Camera;
import com.iu.mobile.Phone;
import com.iu.mobile.Wifi;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		Phone phone = new Phone();
		Camera camera = new Camera();
		Wifi wifi = new Wifi();
		
//		phone.setCamera(camera);
//		phone.setWifi(wifi);
//		
//		phone.getCamera().getInfo();
//		phone.getWifi().getInfo();
		
		
		
		return "home";
	}
	
}
