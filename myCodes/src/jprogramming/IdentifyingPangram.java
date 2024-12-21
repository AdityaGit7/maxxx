package jprogramming;

public class IdentifyingPangram {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		int count = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int j = 0; j < s.length(); j++) {
				if (ch==s.charAt(j)) {
					count ++;
					break;
				}
			}
		}
		if (count == 26) {
			System.out.println("Pangram String");
		} else {
			System.out.println("Not a Pangram String");
		}
	}

}
