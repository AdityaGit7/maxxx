package jprogramming;

import java.util.Scanner;

public class ReversingEachWordInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String s =  sc.nextLine();
		String out = "";
		String[]arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			String rev = "";
			for (int j = s1.length()-1; j >= 0; j--) {
				 rev = rev + s1.charAt(j);
			}
			out = out + rev + " ";
		}
		System.out.println(out);
	}

}
