// PowerPuff Girls (Connie Lei, Yedoh Kang, Donia Tung)
// APCS2 pd1
// Lab#01 -- What Does The Data Say?
// 2017-03-09

/*======================================
  class QuickSortTester
  
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Look in test.csv!
  
  n=<huge>  time: nlogn

  ANALYSIS:
  On average, the run time is nlogn because the sort function itself runs recursively with a O(logn) runtime, 
  	and it calls partition, which has an O(n) runtime. Everytime we iterate through the array, we look at the two 
	partitioned parts of the array, and the partition value is left in its final resting place. We continue to 
	do this on each partitioned part until the values are all in their final resting places. 
  In the best case, the partition value would be the median of the array, so the array would split directly in half. 
  In the worst case, the partition value would be the extreme of the values in the array, so it would have to partition 
  	n times, therefore making it a O(n^2) runtime. 
 	 
  =======================================*/

import java.util.*;
import java.io.*;

public class QuickSortTester 
{
    /******************************
     * execution time analysis 
     Depending on the lengths of arrays we wanted to choose, we put those lengths into an int[] array and then, 
     	populate an array with numbers, then mess up the array, start the timer, run the sort program, 
	end the timer and then average it all.
     ******************************/
    public static void main( String[] args ) {
	try{
	    PrintWriter outputStream = new PrintWriter("test.csv");
	    int[] lengths = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 30, 35, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 200, 300, 400, 450, 500, 550, 600, 700, 800, 1000};
	    for(int length: lengths){
	    //for(int length = 0; length < 10000; length ++){
		int[] a = new int[length];
		for(int r = 0; r < a.length; r ++){
		    a[r] = r;
		}
		long avg = 0;
		int numTest = 100000;
		for(int x = 0; x < numTest; x ++){
		    QuickSort.shuffle(a);
		    long startTime = System.nanoTime();
		    QuickSort.qsort(a, 0, a.length-1);
		    long endTime   = System.nanoTime();
		    long duration  = endTime - startTime;
		    avg += duration;
		    //outputStream.print(a.length + ", " + duration + "\n");
		}
		avg /= numTest;
		//System.out.println("Average time for array length " + a.length + " is " + avg);
		outputStream.print(a.length + ", " + avg + "\n");
	    }
	    outputStream.close();
	}
	catch(Exception e){
	    System.out.println("Something went wrong");
	}
    }//end main
}//end class
