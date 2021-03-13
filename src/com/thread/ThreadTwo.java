package com.thread;

public class ThreadTwo extends Thread {
	private String name;
	public ThreadTwo(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+","+i+"当前线程名称:"+Thread.currentThread().getName()+
					",当前线程ID:"+Thread.currentThread().getId()+i);
//			System.out.println("当前线程名称:"+Thread.currentThread().getName()+
//								",当前线程ID:"+Thread.currentThread().getId()+i);
		}
	}

}
