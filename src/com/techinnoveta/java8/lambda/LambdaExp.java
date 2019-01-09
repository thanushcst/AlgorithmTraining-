package com.techinnoveta.java8.lambda;

public class LambdaExp {

	public static void main(String[] args) {
		LambdaExp lambdaExp = new LambdaExp();
		MathOperation addtion = (a, b) -> a + b;
		
		System.out.println(lambdaExp.operate(3, 7, addtion));
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}

interface MathOperation {
	int operation(int a, int b);
}

interface GreetingService {
	void sayMessage(String message);
}