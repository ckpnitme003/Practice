package com.nt.test;

public class Test01 {
	public static void main(String[] args) {
		Test01 t1=new Test01();
		t1.m1();
	}
	public void m1() {
		System.out.println("m1 method start");
		for(int i=0;i<=10;i++) {
			System.out.println("m1 method -"+i);
		}
		m2();
		System.out.println("m1 method end");
	}
	public void m2() {
		System.out.println("m2 method start");
		for(int i=0;i<=5;i++) {
			System.out.println("m2 method -"+i);
		}
		System.out.println("m2 method end");
	}
}
