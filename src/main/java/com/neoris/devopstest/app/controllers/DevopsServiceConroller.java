package com.neoris.devopstest.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.devopstest.app.models.RequestParam;
import com.neoris.devopstest.app.models.ResponseParam;

@RestController
public class DevopsServiceConroller {
	

	@PostMapping({"/","/DevOps"})
	public Object postDevopsService(@RequestBody RequestParam request) {
		ResponseParam objResponse = new ResponseParam();
		
		objResponse.setMessage("Hello " + request.getToPerson() +" your message will be send");
		
		return objResponse;
	}

}
