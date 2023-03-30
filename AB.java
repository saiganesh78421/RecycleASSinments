package com.recykal.march06;

public class AB extends Inherintance01 {

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		AB ob=new AB();
		ob.add(10, 20);
	}
	
}
