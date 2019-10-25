package com;

import java.util.Scanner;

public class main {
	
	public static int result;
	private static String s;
	private static Scanner in;
	public static String [] arr;
	
	public static void main (String [] args) {
  
		in = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Введите оперцию по типу #_$_#");
		System.out.println("Где '#' переменная, '$' оператор, а '_' пробел");
		System.out.println("---------------------------------------------------------------");

		s = in.nextLine();
				
		for (int i = 0; i < s.length(); i++) {
			arr = s.split(" ");
		}
    
		if (arr.length != 3) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Ошибка при вводе операции: ");
			System.err.println("");
			System.out.println("Работа программы прекращена");
			System.out.println("---------------------------------------------------------------");
			System.exit(0);
		}
    
	check.che();
				
	}
			
	public static void ext(String result) {
    		System.out.println("---------------------------------------------------------------");
		System.out.println("Резельтат выражения " + arr[0] + " " + arr[1] + " " + arr[2] + " = " + result);
		System.out.println("---------------------------------------------------------------");
  }
}
