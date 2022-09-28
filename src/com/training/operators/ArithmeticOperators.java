package com.training.operators;
//Operators constitute the basic building block to any programming language
//Operators are used to perform operations on variables and values
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstNo=20;
		int SecondNo=10;
		System.out.println("The First Number: "+FirstNo);
		System.out.println("The Second Number: "+SecondNo);
		int Add , Sub, Mul;
		double Div,Mod;
		Add = FirstNo + SecondNo;
		Sub = FirstNo - SecondNo;
		Mul = FirstNo * SecondNo;
		Div = FirstNo / SecondNo;
		Mod = SecondNo % FirstNo;
		System.out.println("Addition: "+Add);
		System.out.println("Subtraction: "+Sub);
		System.out.println("Multiplication: "+Mul);
		System.out.println("Division: "+Div);
		System.out.println("Modulus: "+Mod);

	}
}
