/*
 * HeapSortInPlaceTester.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 5 Question 1
 * This is the client code of the implementation of a way to make the heap sort 
 * algorithm more efficient by writing a method that will build a heap in place 
 * using the array to be sorted. 
*/
public class HeapSortTester
{
	/**
	 * Creates an array of Contact objects, sorts them, then prints
	 * them.
	 */
	public static void main(String[] args)
	{
                
                Integer[] data = {6,1,3,2,4,5};

                // display list before sorting
                System.out.println("List before sorting: ");
                for (int i=0;i<data.length;i++)
                    System.out.print(data[i] + " ");
                System.out.println("");

                // instantiate HeapSort object
                HeapSort<Integer> sort = new HeapSort<Integer>(); 
                sort.heapSort(data);

                // display list after sorting
                System.out.println("\n List after sorting: ");
                for (int i =0; i<data.length;i++)
                    System.out.print(data[i] + " ");
                System.out.println("");
	}
}

