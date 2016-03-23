/*
In the previous challenge, you wrote a partition method to split an array into two sub-arrays, one containing smaller elements and one containing larger elements than a given number. This means you 'sorted' half the array with respect to the other half. Can you repeatedly use partition to sort an entire array?

Guideline 
In Insertion Sort, you simply went through each element in order and inserted it into a sorted sub-array. In this challenge, you cannot focus on one element at a time, but instead must deal with whole sub-arrays, with a strategy known as "divide and conquer".

When partition is called on an array, two parts of the array get 'sorted' with respect to each other. If partition is then called on each sub-array, the array will now be split into four parts. This process can be repeated until the sub-arrays are small. Notice that when partition is called on just one numbers, they end up being sorted.

Can you repeatedly call partition so that the entire array ends up sorted?

Print Sub-Arrays 
In this challenge, print your array every time your partitioning method finishes, i.e. whenever two subarrays, along with the pivot, is merged together.

The first element in a sub-array should be used as a pivot.
Partition the left side before partitioning the right side.
The pivot should be placed between sub-arrays while merging them.
Array of length 11 or less will be considered sorted, and there is no need to sort or to print them.
Note 
Please maintain the original order of the elements in the left and right partitions while partitioning around a pivot element.

For example: Partition about the first element for the array A[]={5, 8, 1, 3, 7, 9, 2} will be {1, 3, 2, 5, 8, 7, 9}

Input Format 
There will be two lines of input:

nn - the size of the array
arar - the n numbers of the array
Output Format 
Print every partitioned sub-array on a new line.

Constraints 
1≤n≤10001≤n≤1000 
−1000≤x≤1000,x∈ar−1000≤x≤1000,x∈ar 
Each number is unique.

Sample Input

7
5 8 1 3 7 9 2
Sample Output

2 3
1 2 3
7 8 9
1 2 3 5 7 8 9
*/
import java.util.*;
public class Solution {
       
    public static void quicksort(int[] array, int left, int right) {
        
		if (right - left >= 2) {
	 	   int pivot = partition(array, left, right);
	 	   quicksort(array, left, pivot);
	 	   quicksort(array, (pivot + 1), right);
	 	   print(array, left, right);
		}
	}
    
    static int partition(int[] array, int left, int right) {
              
		int pivot = array[left];
		List<Integer> smallerElements = new ArrayList<Integer>(array.length);
		List<Integer> largerElements = new ArrayList<Integer>(array.length);

		for (int i = left + 1; i < right; ++i) {
			if (array[i] < pivot) {
				smallerElements.add(array[i]);
			} else {
				largerElements.add(array[i]);
			}
		}

		for (int i = 0; i < smallerElements.size(); ++i) {
			array[left + i] = smallerElements.get(i);
		}

		array[left + smallerElements.size()] = pivot;

		for (int i = 0; i < largerElements.size(); ++i) {
			array[left + smallerElements.size() + 1 + i] = largerElements.get(i);
		}

		return left + smallerElements.size();
       }
 
    private static void print(int[] array, int left, int right) {
		for (int i = left; i < right; ++i) {
			print(array[i]);
		}
		System.out.println("");
	}

	private static void print(int element) {
		System.out.print(Integer.toString(element) + " ");
	}
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quicksort(ar, 0, ar.length);
       }    
   }
