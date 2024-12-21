package jprogramming;

import java.util.Scanner;

public class DemoToCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		char[] ch = s.toCharArray();
		for(int i = 0; i<s.length(); i++) {
			System.out.println(ch[i]);
		}
	}

}
