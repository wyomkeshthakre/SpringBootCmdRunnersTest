package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("from Runner");
		System.out.println("args");
		System.out.println(Arrays.asList(args));
	}
	

}
