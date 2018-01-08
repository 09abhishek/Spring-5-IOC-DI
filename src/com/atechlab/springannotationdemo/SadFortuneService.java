package com.atechlab.springannotationdemo;

public class SadFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		
		return "Today is the bad day!";
	}

}
