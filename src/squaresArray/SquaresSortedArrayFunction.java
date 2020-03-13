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
        
        // Storing from the last element to beginning
        // Storing from the biggest to smallest
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
    
    public int[] sortedSquares2(int[] A) {
        int N = A.length;
        
        int positiveIndex = 0;
        
        // Find out where the starting index of positive element
        while(positiveIndex < N && A[positiveIndex] < 0){
            positiveIndex++;
        }
        
        // Find out where the ending index of negative element
        int negativeIndex = positiveIndex - 1;
        
        int[] result = new int[N];
        
        int counter = 0;
        
        // Store from smallest to biggest
        while(positiveIndex < N && negativeIndex >= 0){
            if(A[positiveIndex] * A[positiveIndex] > A[negativeIndex] * A[negativeIndex]){
                result[counter] = A[negativeIndex] * A[negativeIndex];
                negativeIndex--;
            } else {
                result[counter] = A[positiveIndex] * A[positiveIndex];
                positiveIndex++;
            }
            
            counter++;
        }
        
        // Whatever leftover get store into the result array
        while(positiveIndex < N){
            result[counter] = A[positiveIndex] * A[positiveIndex];
            positiveIndex++;
            counter++;
        }
        
        while(negativeIndex >= 0){
            result[counter] = A[negativeIndex] * A[negativeIndex];
            negativeIndex--;
            counter++;
        }
        
        return result;
    }
    
}
