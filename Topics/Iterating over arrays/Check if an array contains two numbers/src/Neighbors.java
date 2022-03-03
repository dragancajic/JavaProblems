import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is too complicated, and it has a few bugs!
// TODO: Try to FIX & REFACTOR!!!
class Neighbors {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int[] arrayOfInts = new int[size];
		
		for (int i = 0; i < size; i++) {
			arrayOfInts[i] = scanner.nextInt();
		}
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		boolean areNeighbors = false;
		
		if (n == m) {
			int i = findAllIndices(arrayOfInts, n).get(0);
			int j = findAllIndices(arrayOfInts, m).get(1);
			
			if (Math.abs(i - j) == 1) {
				areNeighbors = true;
			}
			
			// test 2
			//System.out.println("index of n: " + i);
			//System.out.println("index of m: " + j);
		}
		
		int indexOfN = findIndex(arrayOfInts, n);
		int indexOfM = findIndex(arrayOfInts, m);
		
		// test 1
        /*
        if (n != m) {
            System.out.println("index of n: " + indexOfN);
            System.out.println("index of m: " + indexOfM);
        }
        */
		
		int neighborhood = 0;
		if (indexOfN != -1 && indexOfM != -1) {
			neighborhood = Math.abs(indexOfN - indexOfM);
		}/* else {
            System.out.println("No such element in the array!");
        }*/
		
		if (neighborhood == 1) {
			areNeighbors = true;
		}
		System.out.println(areNeighbors);
		// or simplified 'if' statement would be just as such:
		//boolean areNeighbors = neighborhood == 1;
		//System.out.println(areNeighbors);
	}
	
	// find index/indices of any given element that belongs to the array
	public static int findIndex(int[] arrayOfElements, int element) {
		for (int index = 0; index < arrayOfElements.length; index++) {
			if (arrayOfElements[index] == element) {
				return index;
			}
		}
		return -1;
	}
	
	public static ArrayList<Integer> findAllIndices(int[] arrayOfElements, int element) {
		ArrayList<Integer> indices = new ArrayList<>();
		
		for (int index = 0; index < arrayOfElements.length; index++) {
			if (arrayOfElements[index] == element) {
				indices.add(index);
			}
		}
		return indices;
	}
}
