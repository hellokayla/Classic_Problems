public class CountStairs {
	
	public static int countWays(int n) {
		int[] memo = new int[n+1];
		if (n < 0)   {return 0;}
		if (n == 1 ) {return 1;}
		if (n == 2 ) {return 2;}
		if (n == 3 ) {return 4;}

		if (memo[n]== 0) {

			memo[n] = countWays(n-1) + countWays(n-2) +countWays(n-3);
		}
		
		return memo[n];

	}
	
	public static void main(String[] args) {
		int n = 4;
		int ways = countWays(n);
		System.out.println(ways);
	}

}