package com.core.day17;

public class TestThreadLocal {

	public static void main(String[] args) {
		Runnable r = new IntegerRun();
		//
		for(int i = 0;i < 3;i++) {
			Thread t = new Thread(r);
			t.start();
		}
		//
		System.out.println("main Ïß³Ì½áÊø....");
	}
}
