package com.callor.app;



class Foo {
	public static String classVar ="I Class Var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);
	}
}
public class MYOOP {

	
	
	public static void main(String[] args) {
		
	System.out.println(Foo.classVar);	
//	System.out.println(Foo.instanseVar);
	}
}
