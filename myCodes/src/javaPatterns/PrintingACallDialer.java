package javaPatterns;

public class PrintingACallDialer {

	public static void main(String[] args) {
		int n = 3;
		int a = 1;
		for(int i = 0; i < n; i++){ //for rows
			for(int j = 0; j < n; j++) { //for columns
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

}
