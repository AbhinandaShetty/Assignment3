package com.example.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobile.entity.Mobile;
import com.example.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	private MobileService mobileService;

	@PostMapping
	public Mobile addMobile(@RequestBody Mobile mobile) {
		return mobileService.save(mobile);
	}

	@GetMapping(path = "/{id}")
	public Mobile getMobile(@PathVariable int id) {
		return mobileService.getMobile(id);
	}

	@PutMapping
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return mobileService.update(mobile);
	}

	@DeleteMapping
	public Mobile deleteMobile(@RequestBody Mobile mobile) {
		return mobileService.delete(mobile.getId());
	}
	
}
