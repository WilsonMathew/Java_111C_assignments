// Just some practice with recursion
// This program doesn't have any data validation
// the recursion ends at 1

public class Factorial {

	static int i = 1;

	public static void main(String[] args) {
		int result = compute(4);
		System.out.println(result);
	}
	
	public static int compute(int n) { 
		
		// tracing recursion
		System.out.println("i = " + (i++));
		System.out.println("n = " + (n));

		if(n == 1) {
			System.out.println("I return 1 at this point");
			return 1;
		} else {
			int result = n*compute(n - 1);
			return result;
		}

	}

}
