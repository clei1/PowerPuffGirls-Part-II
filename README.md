# PowerPuffGirls-Part-II

## Yedoh Kang, Connie Lei, Donia Tung

## APCS2 pd1

## LAB #01

##### Our methodology is using first creating an array of certain length. The array is shuffled and then we run the start timer right before the function starts running. The timer is ended once the function ends and then it is printed to the terminal (which is currently commented out right now) and also to a csv file for easy copy pasta to Desmos. The csv file is rewritten each time. Our graph link is below. 

##### Click [here] (https://www.desmos.com/calculator/sqyuwfwv20)

##### Analysis of the graph shows that the function has a several possible best fit lines in the form of quadratic, linear and logarithmic. The logarithmic lines have the least deviation from the orginal points. This supports our statements by showing the average has a O(n log n) runtime.

##### The classification for worst case scenario is O(n^2). Our algorithm could potentially always choose the worst possible pivot for our partition method meaning we will create two separate sections in the array to be sorted, but one of the sections will be length 0 and the other will be the entire section of length, just without our pivot point that has been sorted. This means we will iterate through the entire list n times and we keep going through n the first time, n-1 the second, n-2… and the sum of that arithmetic sequence is n(n+1)/2 which is just O(n^2).

##### The classification for best case scenario is O(n log n). Our algorithm could potentially always choose the median in the array as the pivot point meaning we create two separate sections of equal length. This means each time, it will be evenly divide in half and iterate through the sections, which add up to n. If you go through it log n times, and each time you go through n terms, then it is O(n log n).

##### The classification for the average case scenario is O(n log n). Our algorithm could potentially choose any number in the array as the pivot point. This means there is an equal chance of any length array. The number of times you will go through the list will be averaged to log n and since each time you go through n terms, then you have O(n log n). It is rare to have the worst case scenario and so you will often have gone through the array xlog n times.
