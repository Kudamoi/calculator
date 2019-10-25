package com;

public class calculate {
	
	public static int result;
	
	public static void calclate(int num1, int num2, char op) {

		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		
		case '-':
			result = num1 - num2;
			break;
		
		case '/':
			result = num1 / num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
		
		default: 
			System.out.println("---------------------------------------------------------------");
			System.out.println("Ошибка определения оператора:");
			System.err.println("Допустимые операторы:  '+', '-', '*', '/'");
			System.out.println("Работа программы прекращена");
			System.out.println("---------------------------------------------------------------");
			System.exit(0);
		}
	}
}
