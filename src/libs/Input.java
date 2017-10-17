package libs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public static Scanner sc = new Scanner(System.in);
	
	public static int get_int() {
		Integer retInt = Integer.MAX_VALUE;
		while(retInt.equals(Integer.MAX_VALUE)) {
			try {
				int i = sc.nextInt();
				retInt = i;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for integer. input a correct integer: ");
				sc = new Scanner(System.in);
			}
		}
		return retInt;
	}

	public static float get_float() {
		Float retFloat = Float.MAX_VALUE;
		while(retFloat.equals(Float.MAX_VALUE)) {
			try {
				float f = sc.nextInt();
				retFloat = f;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retFloat;
	}

	public static char get_char() {
		Character retChar = Character.MAX_VALUE;
		while(retChar.equals(Character.MAX_VALUE)) {
			try {
				String s = sc.next();
				retChar = s.charAt(0);
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retChar;
	}
	
	public static String get_string() {
		String retStr = "";
		while(retStr.equals("")) {
			try {
				String s = sc.next();
				retStr = s;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retStr;
	}
	

}
