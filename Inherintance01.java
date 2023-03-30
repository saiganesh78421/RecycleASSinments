package com.recykal.march06;

public abstract class Inherintance01 {
	static int a=12;
	static float b=1.2f;
	char ch='a';
	int cast=(int)ch;
		public static void main(String[] args) {
		System.out.println(a<b);
		Object n=2;
		Object m=2.4f;
		Object j="ram";
		try {
			//System.out.println("ASSci value for::"+cast);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(n+m);
		try {
		//	System.out.println(n+m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public abstract void add(int a, int b) ;
	
}
