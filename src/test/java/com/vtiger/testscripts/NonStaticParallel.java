package com.vtiger.testscripts;
public class NonStaticParallel {
	static int a;
	int b;
	NonStaticParallel(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		NonStaticParallel c1=new NonStaticParallel(10,10);
		System.out.println("calling static using first object---> "+c1.a);
		NonStaticParallel c2=new NonStaticParallel(20,20);
		System.out.println("calling static using first object---> "+c1.a);//20
		System.out.println("calling static using second object---> "+c2.a);//20
		System.out.println("calling non static using first object---> "+c1.b);//10
		System.out.println("calling non static using second object---> "+c2.b);//20
	}
}
