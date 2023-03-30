//Printer.Java
package com.recykal.march06;

public class Printer {

	public  synchronized void print1(int n, String name) {
		for(int i=1;i<=n;i++) {
			System.out.println(i+ " Printer for user  "  +name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}
}
