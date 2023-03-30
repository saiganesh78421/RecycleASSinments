package com.recykal.march06;
/*Life cycle of a Thread (Thread States)

New.
Active.
Blocked / Waiting.
Timed Waiting.
Terminated.*/
public class User1 implements Runnable{
	public Printer p;
	public User1(Printer p) {
		this.p=p;
	}
	@Override
    public void run() {
    	p.print1(5, "raja");
    }
}
