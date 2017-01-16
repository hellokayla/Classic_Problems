/* This is the solution to the classic DP fibonacci problem */
public class Fibonacci {

	
	public static int Fibonacci (int i){

        int[] memo = new int[i+1];
		if (i == 0) {return 0;}
        if (i == 1) {return 1;}

		// Needs to scan the Memo!
		if (memo[i]== 0) {

			memo[i] = Fibonacci(i-1) + Fibonacci(i-2);
        }
		
		return memo[i];

	}

	public static void main (String[] args) {

		int n = 5; 
        System.out.println(Fibonacci(n));
	}


}