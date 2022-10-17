package CalculatorPack;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator obj =new Calculator();
		int sum,sub,mul;
		sum=obj.addition(30, 20);
		System.out.println("Addition is "+sum);
		sub=obj.subtraction(30, 10);
		System.out.println("Subtraction is "+sub);
		mul=obj.multiplication(30, 2);
		System.out.println("Multiplication is "+mul);
	}

}
