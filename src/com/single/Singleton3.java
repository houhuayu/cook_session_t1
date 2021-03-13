package com.single;

public class Singleton3 {
	private static final Singleton3 instance;
	static {
		instance = new Singleton3();
	}
	private Singleton3() {
	}
}
