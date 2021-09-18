package com.surya.concurrent.threadfactory;

public class Demo {

	public void execute() {
		suryaThreadFactory factory = new suryaThreadFactory("suryaThreadFactory");
		for (int i = 0; i < 10; i++) {
			Thread t = factory.newThread(new Task());
			t.start();
		}
	}

}
