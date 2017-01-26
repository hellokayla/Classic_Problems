import java.util.*;
public class ProductArrayPuzzle {
    public static int[] productArray(int[] A) {

       	// Get all the product of all integers before each index 
        int[] memoB = new int[A.length];
        int[] memoAf = new int[A.length];
        int[] result = new int[A.length];

        int productsB  = 1;
        int productsAf = 1; 

        for (int i = 0; i < A.length; i++) {

            memoB[i]  = productsB;
            productsB = A[i]*productsB;
            
        }
        
        for (int j = A.length-1; j >= 0; j--) {
            
            memoAf[j]  = productsAf; 
            productsAf = A[j]*productsAf;
            
        }

        for (int i = 0; i < A.length; i++) {

            result[i] = memoB[i]*memoAf[i];

        }
        return result; 
    }
    public static void main(String[] args) {
       
        int[] A = new int[]{3,1,2,5,6,4};
        int[] result = new int[A.length];
        result = productArray(A);
        System.out.println(Arrays.toString(result));
    }
}