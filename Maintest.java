package com.recykal.march06;

public class Maintest{
	 public static void main(String[] args) throws InterruptedException {
		Display01 ob=new Display01();
		Display2 ob1=new Display2();
		
		
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
//	Thread thread = new Thread(t1);
		t1.start();
	t1.yield();
	t1.join();
		t2.start();
	}
}
