/*
 * HeapSort.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 5 Question 1
 * This is the implementation of a way to make the heap sort 
 * algorithm more efficient by writing a method that will build a heap in place 
 * using the array to be sorted. 
*/

import jsjf.ArrayHeap;

/**
 * HeapSort sorts a given array of Comparable objects using a heap.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class HeapSort<T>
{
        
	/**
	 * Sorts the specified array using a Heap
	 *
	 * @param data the data to be added to the heapsort
	 */
	public void heapSort(T[] data) 
	{
		ArrayHeap<T> heap = new ArrayHeap<T>();

		// copy the array into a heap 
		for (int i = 0; i < data.length; i++)
			heap.addElement(data[i]);

		// place the sorted elements back into the array 
		int count = 0;
		while (!(heap.isEmpty()))
		{
			data[count] = heap.removeMin();
			count++;
		}
	}
}