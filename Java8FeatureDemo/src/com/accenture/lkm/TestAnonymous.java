package com.accenture.lkm;

interface Calculator
{
	public int compute(int x, int y);
}

public class TestAnonymous{
	public static void main(String args[]) {
	Calculator obj = new Calculator()
	{

		@Override
		public int compute(int x, int y) {
			return x+y;
		}
		
	};
	Calculator obj2 = new Calculator()
			{
				@Override
				public int compute(int x, int y) {
					return x+y;
				}
			};
	System.out.println("Addition : "+obj.compute(10, 20));
	System.out.println("Subtraction : "+obj2.compute(10, 20));
	}
}
