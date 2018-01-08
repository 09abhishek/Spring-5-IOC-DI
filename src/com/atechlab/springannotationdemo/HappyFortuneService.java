package com.atechlab.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		
		return "Happy Fortune service";
	}

}
