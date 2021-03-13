package com.thread;

public class RunnableDemo1 {

	public static void main(String[] args) {
//		MyThread thread = new MyThread("线程A");
//		Thread t = new Thread(thread);
//		MyThread thread2 = new MyThread("线程B");
//		Thread t2 = new Thread(thread2);
//		t.start();
//		t2.start();
		ThreadTwo thread = new ThreadTwo("线程A");
//		Thread t = new Thread(thread);
		Thread t = new Thread(thread,"线程A名称:aa");
		ThreadTwo thread2 = new ThreadTwo("线程B");
		Thread t2 = new Thread(thread2);
		t.start();
		t2.start();

	}

}
