package com.recykal.march06;

public class ThreadLifeCycleMain {
	public static void main(String[] args) {
		
			Printer p=new Printer();
		User1 ob= new User1(p);
		User2 ob1= new User2(p);
		  
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
		t1.start();
		t2.start();
	}
}
