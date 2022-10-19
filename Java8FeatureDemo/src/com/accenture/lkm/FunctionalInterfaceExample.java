package com.accenture.lkm;
@FunctionalInterface
interface Cal
{
	public abstract int compute(int x, int y);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Cal ob1 =(x,y)->{return x+y;};
		Cal ob2 =(x,y)->{return x-y;};
		System.out.println("Addition : "+ob1.compute(10,40));
		System.out.println("Subtraction : "+ob2.compute(10,20));
	}

}
