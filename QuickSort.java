/* CS245 Practice Assignment 4 quick sort
victoria nerecina
this program:
implements SortingAlgorithm interface (given)

Quick Sort:


	

Runtime:
	best: big-O(nlgn)
	worst: big-O(n^2)
	average: big-O(nlgn)

*/

//code from geeks for geeks 

public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		quicksort(a, 0, a.length - 1);
	}

	public void quicksort(int [] a, int left, int right)
	{
		if(left < right)
		{
			int partition = partition(a, left, right); 
			quicksort(a, left, partition - 1); 
        	quicksort(a, partition + 1, right); 
        }	
 
    } 

	public int partition(int a[], int left, int right) 
    { 
        int pivot = a[right]; //last element as pivot
        int i = (left - 1); 
        for (int j = left; j < right; j++) 
        { 
            if (a[j] < pivot) 
            { 
                i++; 
 
 				//swap a[i] adn a[j]
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
        //swap a[i+1]and a[right] or the pivot
        int temp = a[i+1]; 
        a[i+1] = a[right]; 
        a[right] = temp; 
  
        return i + 1; 
    } 
}
 