package com.recykal.march06;

public class Consumer implements Runnable {
	Producer p=null;
	public Consumer(Producer p) {
		this.p=p;
	}
	@Override
	public void run() {
		try {
		synchronized (p.sb) {
			System.out.println("cotrol with in the Coustomer");
			
				p.sb.wait();
			System.out.println("========Display using Consumer==========");
			System.out.println(p.sb.toString());
		}
	
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
