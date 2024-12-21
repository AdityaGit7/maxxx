package jprogramming;

import java.util.Scanner;

public class ReversingASentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String s = sc.nextLine();
		String op = "";
		String [] arr = s.split(" ");
		for (int i = arr.length-1; i >= 0; i--) {
			if(i==0) {
				op = op+arr[i];
			}else {
				op = op+arr[i]+" ";
			}
		}
		System.out.println(op);
	}

}
