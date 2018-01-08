package com.atechlab.springannotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {
	// create a array of strings
	private String[] data = {
			"Abhi",
			"Kuhu",
			"Neha"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// pick random string from the array.
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
