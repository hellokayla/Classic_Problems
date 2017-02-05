import java.util.*; 
public class mergeArrays{
    public static int[] mergeArrays(int[] a1, int[] a2) {
        
        int[] mergedArray = new int[a1.length + a2.length];
        int i1 = 0; 
        int i2 = 0; 
        int n  = 0; 
        
        while (i1 < a1.length && i2 < a2.length)  {
         
            if (a1[i1] > a2[i2]) { 
             	
                mergedArray[n] = a2[i2];
                i2++;
                n++;
            }
            else {
                mergedArray[n] = a1[i1];
                i1++;
                n++;
            } 
        }

        
        while ( i1 < a1.length ) {
            
            mergedArray[n] = a1[i1];
            i1++;
            n++;
            
        }
        
        while ( i2 < a2.length ) {
            
         	mergedArray[n] = a2[i2];
            i2++;
            n++;
        }
        
        
        return mergedArray; 
        
    }
    public static void main(String[] args) {
         int[] myArray     = new int[]{3, 4, 6, 10, 11, 15};
		 int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		 int[] mergedArray = new int[myArray.length + alicesArray.length];
		 mergedArray =  mergeArrays(myArray, alicesArray);
        
         for (int i = 0; i < mergedArray.length; i++) {
         		
                System.out.print(mergedArray[i]+",");
         }
		 // prints [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19]
    }
}