package squaresArray;

public class SquaresSortedArrayFunction {
    public int[] sortedSquares(int[] A) {
        // Length of A array
        int n = A.length;
        
        // Final answer
        int[] result = new int[n];
        
        // First element
        int i = 0;
        
        // Last element
        int j = n - 1;
        
        // Start from last element
        for(int k = n - 1; k >= 0; k--){
            // Comparing from first element to the last element
            if(Math.abs(A[i]) > Math.abs(A[j])){
                // Will add the biggest element to the last index and so on
                result[k] = A[i] * A[i];
                
                // The first element will go to the next element
                i++;
            }else{
                // Will add the biggest element to the last index and so on
                result[k] = A[j] * A[j];
                
                // The last element will get to the previous element and continues since biggest is already in the result array
                j--;
            }
        }
        
        return result;
    }
}
