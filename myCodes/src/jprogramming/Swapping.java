package jprogramming;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("Before Swapping: ");
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After Swapping: ");
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
	}

}
