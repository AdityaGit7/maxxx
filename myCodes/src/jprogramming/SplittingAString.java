package jprogramming;

public class SplittingAString {

	public static void main(String[] args) {
		String s = "All the best";
		String [] arr = s.split(" ");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
