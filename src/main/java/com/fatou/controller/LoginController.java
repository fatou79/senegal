package com.fatou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")

public class LoginController {
	@Autowired
	LoginService team;
	
//	@RequestMapping(value = "/login")
//	@ResponseBody
//	public String wearethewinner() {
//		return "the lions women";
//	}
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String wearethewinner() {
		return "login";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String weareverycourageous(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if(!team.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}


}
