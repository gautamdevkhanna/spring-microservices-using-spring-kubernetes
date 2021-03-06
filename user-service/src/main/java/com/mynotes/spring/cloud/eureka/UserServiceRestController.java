package com.mynotes.spring.cloud.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserServiceRestController {
	
	@RequestMapping(value = "/public-address", method = RequestMethod.GET)
	@ResponseBody
	public String getContact() {
		return "Public mail Address";
	}
	

}
