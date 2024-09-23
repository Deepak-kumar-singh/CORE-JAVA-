package com.copycons;

public class A {

	private double re, im;
	
	
	public A(double re, double im)
	{
		this.re=re;
		this.im = im;
	}
	A(A copy)
	{
		System.out.println("copy constructor shwing..");
		
		re = copy.re;
		im = copy.im;
	}
	
	public String toString()
	{
		return (re +" + "+ im);
	}
	public static void main(String[] args) {
		
		 A a = new A(10,5);
	 // Following involves a copy constructor call
		A aa = new A(a);
		
		A aaa = a;
		
		System.out.println(a);
		
	}
}


