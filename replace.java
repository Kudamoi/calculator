package com;

public class replace {
	
	public static int num;
	public static String result;
	
	public static int repl(String checked) {
		switch (checked) {
			case "I":
				num = 1;
				break;
			case "II":
				num = 2;
				break;
			case "III":
				num = 3;
				break;
			case "IV":
				num = 4;
				break;
			case "V":
				num = 5;
				break;
			case "VI":
				num = 6;
				break;
			case "VII":
				num = 7;
				break;
			case "VIII":
				num = 8;
				break;
			case "IX":
				num = 9;
				break;
			case "X":
				num = 10;
				break;
			default:
				num = 0;
		}
		return num;
	}
	
	public static void undo(int checked) {
		switch (checked) {
		case 100: result = "C"; break;
		case 90: result = "XC"; break;
		case 80: result = "LXXX"; break;
		case 70: result = "LXX"; break;
		case 60: result = "LX"; break;
		case 50: result = "L"; break; 
		case 40: result = "XL"; break;
		case 30: result = "XXX"; break;
		case 20: result = "XX"; break;
		case 81: result = "LXXXI"; break;
		case 72: result = "LXXII"; break;
		case 64: result = "LXIV"; break;
		case 63: result = "LXIII"; break;
		case 56: result = "LVI"; break;
		case 54: result = "LIV"; break;
		case 49: result = "XLIX"; break;
		case 48: result = "XLVIII"; break;
		case 45: result = "XLV"; break;
		case 42: result = "XLII"; break;
		case 36: result = "XXXVI"; break;
		case 35: result = "XXXV"; break;
		case 32: result = "XXXII"; break;
		case 28: result = "XXVIII"; break;
		case 27: result = "XXVII"; break;
		case 24: result = "XIV"; break;
		case 21: result = "XXI"; break;
		case 19: result = "XIX"; break;
		case 18: result = "XVIII"; break;
		case 17: result = "XVII"; break;
		case 16: result = "XVI"; break;
		case 15: result = "XV"; break;
		case 14: result = "XIV"; break;
		case 13: result = "XIII"; break;
		case 12: result = "XII"; break;
		case 11: result = "XI"; break;
		case 10: result = "X"; break;
		case 9: result = "IX"; break;
		case 8: result = "VIII"; break;
		case 7: result = "VII"; break;
		case 6: result = "VI"; break;
		case 5: result = "V"; break;
		case 4: result = "IV"; break;
		case 3: result = "III"; break;
		case 2: result = "II"; break;
		case 1: result = "I"; break;
		case -1: result = "-I"; break;
		case -2: result = "-II"; break;
		case -3: result = "-III"; break;
		case -4: result = "-IV"; break;
		case -5: result = "-V"; break;
		case -6: result = "-VI"; break;
		case -7: result = "-VII"; break;
		case -8: result = "-VIII"; break;
		case -9: result = "-IX"; break;
		default: result = "0";
		}
	main.ext(result);
	}
}
