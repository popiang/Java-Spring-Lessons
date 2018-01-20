package com.popiang.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Just do it!!", "I'm your father", "Talk to the hand"};
	private Random random = new Random();

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(3)];
	}

}
