package com.recykal.march06;

public class ConsumerProducerMain {
	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		 
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t1.start();
		t2.start();
		
	}

}
