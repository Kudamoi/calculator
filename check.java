package com;

import com.main;

public class check {
	
	public static int num1;
	public static int num2;
	public static int result;
	public static String exit;
	private static char op;
	private static int a,b;
	private static String [] arr;
	
	public static void che(){
		
		arr = main.arr;
		
		String [] checkarr = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		String [] checkarrnum = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		for (int i = 0; i < checkarr.length; i++) {
			if(checkarr[i].equals(arr[0])) {
				a = 1;
			}
			if (checkarr[i].equals(arr[2])){
				b = 1;
			}
		}
		
		if (a != b) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Ошибка при вводе переменных: ");
			System.err.println("Переменные могут быть арабскими от I ... X включительно,");
			System.err.println("либо римскими цифрами от 1 ... 10 включительно!");
			System.out.println("Работа программы прекращена");
			System.out.println("---------------------------------------------------------------");
			System.exit(0);
		}
		
		if (a == 1 && b == 1) {
			
			replace.repl(arr[0]);
			num1 = replace.num;
			
			replace.repl(arr[2]);
			num2 = replace.num;
			op = arr[1].charAt(0);
			
			calculate.calclate(num1, num2, op);
			result = calculate.result;
			replace.undo(result);
		}
		
		if (a == 0 && b == 0) {
			for (int i = 0; i < checkarrnum.length; i++) {
				if(checkarrnum[i].equals(arr[0])) {
					a = 2;
				}
				if(checkarrnum[i].equals(arr[2])) {
					b = 2;
				}
			}

			if (a != b) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("Ошибка при вводе переменных: ");
				System.err.println("Переменные могут быть арабскими от I ... X включительно,");
				System.err.println("либо римскими цифрами от 1 ... 10 включительно!");
				System.out.println("Работа программы прекращена");
				System.out.println("---------------------------------------------------------------");
				System.exit(0);
			}
			
			num1 = Integer.parseInt(arr[0]);
			op = arr[1].charAt(0);
			num2 = Integer.parseInt(arr[2]);
			
			if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("Ошибка при вводе переменных: ");
				System.err.println("Переменные могут быть арабскими от I ... X включительно,");
				System.err.println("либо римскими цифрами от 1 ... 10 включительно!");
				System.out.println("Работа программы прекращена");
				System.out.println("---------------------------------------------------------------");
				System.exit(0);
			}
			
			calculate.calclate(num1, num2, op);
			
			exit = calculate.result + "";
			main.ext(exit);
		}
	}
}
