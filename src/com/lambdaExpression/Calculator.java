package com.lambdaExpression;

public class Calculator {
	public static void calculate(Cal_Interface x) {
		x.cal(10,5);
	}
public static void main(String[] args) {
	//implementation of abstract method/function into (calculate)function of Calculator class
	                         //lambda expression
	Calculator.calculate((int a,int b)-> {
		System.out.println("Addition :"+(a+b));
		});
	
	Calculator.calculate((int a, int b)->{
		System.out.println("Substraction :"+(a-b));
	});
	
	Calculator.calculate((int a, int b)->System.out.println("Multiplication :"+(a*b)));

 Calculator.calculate((int a, int b)->System.out.println("Dicision :"+(a/b)));
}
}
