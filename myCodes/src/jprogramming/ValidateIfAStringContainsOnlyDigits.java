package jprogramming;

import java.util.Scanner;

public class ValidateIfAStringContainsOnlyDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		try {
			Integer.parseInt(s);
			System.out.println("String contains only digits.");
		} catch (Exception e) {
			System.out.println("String doeas not contain only digits");
		}
	}
}