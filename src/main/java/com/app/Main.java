package com.app;

import java.util.Objects;

import com.app.config.Config;

public class Main {

	public static void main(String[] args) {
		Config config = Config.getInstance();
		
		System.out.println(config.getUrl());
		System.out.println(config.getUser());
		System.out.println(config.getPassword());
		
		Config conf1 = Config.getInstance();
		Config conf2 = Config.getInstance();
		
		System.out.println(Objects.equals(conf1, conf2));
		
	}

}
