package javaPatterns;

public class PrintingAlphabetsInDialerPattern {

	public static void main(String[] args) {
		char ch = 'A';
		int n = 4;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
