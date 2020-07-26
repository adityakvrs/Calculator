package com.epam.calculator;
public class CalculatorOperations {
	/*
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int add(int a,int b) {
		return a + b;
	}
	/*
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public int sub(int a,int b) {
		return a - b;
	}
	/*
	 * @param a
	 * @param b
	 * @returns a*b
	 */
	public int mul(int a,int b) {
		return a * b;
	}
	/*
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public int div(int a,int b) {
		
		if(b == 0)
			throw new ArithmeticException();
		else if(b>a)
		{
		    return 0;
		}
		else 
			return a / b;
	}
}