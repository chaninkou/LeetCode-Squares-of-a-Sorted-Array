package squaresArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] A = {-4,-1,0,3,10};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		SquaresSortedArrayFunction solution = new SquaresSortedArrayFunction();
		
		String sortedSquaresArray = Arrays.toString(solution.sortedSquares(A));
		System.out.println("Solution: " + sortedSquaresArray);
	}
}
