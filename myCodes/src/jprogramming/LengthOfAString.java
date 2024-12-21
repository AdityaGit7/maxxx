package jprogramming;

public class LengthOfAString {

	public static void main(String[] args) {
		String s = "Java is a programming language";
		char[] ch = s.toCharArray();
		int length = 0;
		for (char c : ch) {
			length ++;
		}
		System.out.println("Length of the String: " + length);
	}

}
