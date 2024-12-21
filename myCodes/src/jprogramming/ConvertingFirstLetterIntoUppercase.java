package jprogramming;

import java.util.Scanner;

public class ConvertingFirstLetterIntoUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s = sc.nextLine();
		String out = "";
		String [] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] ch = arr[i].toCharArray();
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[0] -= 32;
			}
			String s1 = new String(ch);
			out = out + s1 + " ";
		}
		System.out.println(out);
	}

}
