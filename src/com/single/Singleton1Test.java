package com.single;

import com.single.Singleton1;

public class Singleton1Test {

	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.instance;
		System.out.println(singleton1);
//		Singleton2 singleton2 = Singleton2.oneinstance;
//		System.out.println(singleton2);
	}

}
