/* CS245 Practice Assignment 4 merge sort
victoria nerecina
this program:
implements SortingAlgorithm interface (given)

Merge Sort:
	divides input array in two halves
	then merges the two sorted halves

Runtime:
	best: big-O(nlgn)
	worst: big-O(nlgn)
	average: big-O(nlgn)

*/

//from geeks for geeks 

public class MergeSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		merge(a, 0, a.length - 1);
	}

	public void mergesort(int [] a, int left, int middle, int right)
	{
		//size of the two subarrays
		int leftSize = middle - left + 1;
		int rightSize = right - middle;
		
		//creating temporary arrays
		int leftArray[] = new int [leftSize];
		int rightArray[] = new int [rightSize];

		//copy data of subarrays to the temp arrays
		for(int leftIndex = 0; leftIndex < leftSize; ++leftIndex)
		{
			leftArray[leftIndex] = a[left + leftIndex];
		}
		for(int rightIndex = 0; rightIndex < rightSize; ++rightIndex)
		{
			rightArray[rightIndex] = a[middle + 1 + rightIndex];
		}

		//merge the temparrays

		//initial indexes of leftArray rightArray
		int leftIndex = 0;
		int rightIndex = 0;

		//initial index of merges subarray
		int k = left;
		while (leftIndex < leftSize && rightIndex < rightSize)
		{
			if(leftArray[leftIndex] <= rightArray[rightIndex])
			{
				a[k] = leftArray[leftIndex];
				leftIndex++;
			}
			else
			{
				a[k] = rightArray[rightIndex];
				rightIndex++;
			}
			k++;
		}

		//copying remaing elements of leftArray
		while (leftIndex < leftSize)
		{
			a[k] = leftArray[leftIndex];
			leftIndex++;
			k++;
		}

		//copying remaing elements of rightArray
		while (rightIndex < rightSize)
		{
			a[k] = rightArray[rightIndex];
			rightIndex ++;
			k++;
		}
	}

	public void merge(int [] a, int left, int right)
	{
		if(left < right)
		{
			//middle
			int middle = (left + right)/2;

			//sort
			merge(a, left, middle);
			merge(a, middle + 1, right);

			//merge
			mergesort(a, left, middle, right);
		}
	}
}