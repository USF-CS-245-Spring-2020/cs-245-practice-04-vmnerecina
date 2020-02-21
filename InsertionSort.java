/* CS245 Practice Assignment 3 and Practice Assignment 4 insertion sort
victoria nerecina
this program:
implements Practice03Sort interface (given)
or
implements SortingAlgorithm interface (given)

Insertion Sort:
	say all the to the left is sorted already
		1. copy next unsorted value to temp
		2. move each b=value from "sorted" until
			a. sorted value is < temp
			b. run out of values
		3. copy temp to previous location 
	

Runtime:
	best: big-O(n-1) = big-O(n), the array is already in order
	worst: big-O(n^2), 
	average: big-O(n^2), but better than bubble sort and selection sort average

*/

//public class InsertionSort implements Practice03Sort

public class InsertionSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int temp = a[i]; //step 1
			int j = i - 1; //j = previous value
			while(j >= 0 && temp < a[j]) //setp 2
			{//while the first value selected is < the next value
				a[j+1] = a[j]; //previous value + 1 = next value = a[j]
				j--;
			} //end of while loop

			a[j+1] = temp; //step 3

		}//end of for loop
	}

}