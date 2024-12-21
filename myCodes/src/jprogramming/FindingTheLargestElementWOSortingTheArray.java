package jprogramming;

import java.util.Scanner;

public class FindingTheLargestElementWOSortingTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {60,40,20,30,50};
		System.out.println("Enter the n value from 1 to " +a.length);
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[i]) {
					count++;
				}
			}
			if (count==n-1) {
				System.out.println(a[i]);
			}
		}
	}

}
