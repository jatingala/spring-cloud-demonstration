package com.jatin.springcloud.demo.limitsservice.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class LimitsService {

	private AtomicLong limit = new AtomicLong(1_000_000);

	public long getLimit() {
		return limit.get();
	}

	public long updateLimit(long amount) {
		return limit.addAndGet(amount);
	}

}
