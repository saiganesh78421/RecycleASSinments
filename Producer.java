package com.recykal.march06;

public class Producer implements Runnable {
	StringBuffer sb=null;
	public Producer() {
		sb=new StringBuffer();
	}
	@Override
	public void run() {
		try {
			synchronized (sb) {
				for(int i=1;i<=5;i++) {
					sb.append(i+" ");
					System.out.println("Stirng Buffer Appending");
					Thread.sleep(2000);
				}
				sb.notify();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
