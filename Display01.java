package com.recykal.march06;

public class Display01  implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task-1:"+i);{
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		}
	}
	
}

 