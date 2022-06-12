package com.jatin.springcloud.demo.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.springcloud.demo.limitsservice.service.LimitsService;

@RestController
public class LimitsController {

	@Autowired
	private LimitsService limitsService;

	@GetMapping("/limit")
	public long getLimit() {
		return limitsService.getLimit();
	}

	@PostMapping("/limit")
	public long updateLimit(@RequestBody long amount) {
		return limitsService.updateLimit(amount);
	}

}
