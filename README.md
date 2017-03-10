# PowerPuffGirls-Part-II

## Yedoh Kang, Connie Lei, Donia Tung

## APCS2 pd1

## LAB #01

#### Methodology

##### We first created an array of a certain length. The array is shuffled, and the start timer is run right before the function starts running. The timer is ended once the function ends and then it is printed to the terminal (which is currently commented out right now) and also to a csv file for easy copy pasta to Desmos. The csv file is rewritten each time. 

#### Time Measurements and Analysis

##### Our graph link with all our values and plotted points, as well as the general fit of the runtime is [here.] (https://www.desmos.com/calculator/sqyuwfwv20)

##### Analysis of the graph shows that the function has several possible best fit lines in the form of quadratic, linear and logarithmic. The logarithmic lines have the least deviation from the orginal points. This supports our statements by showing the average runtime is O(nlogn).

#### Best Case Scenario

##### The classification is O(nlogn). Our algorithm could potentially always choose the median in the array as the pivot point, meaning that we create two separate sections of equal length. This means each time, it will evenly divide in half and iterate through the sections, which add up to n. If you go through it log(n) times, and each time you go through n terms, then it is O(nlogn).

#### Average/Most Likely Case Scenario

##### The classification is O(nlogn). Our algorithm could potentially choose any number in the array as the pivot point. This means there is an equal chance of any length array. The number of times you will go through the list will be averaged to log(n) and since each time you go through n terms, you have a runtime of O(nlogn). It is rare to have the worst case scenario so you will often go through the array nlog(n) times.

#### Worst Case Scenario

##### The classification is O(n^2). Our algorithm could potentially always choose the worst possible pivot for our partition method, meaning that we will create two separate sections in the array to be sorted, but one of the sections will be length 0 and the other will be the entire section of length, excluding the element at the pivot point. This means we will iterate through the entire list n times and we keep going through n the first time, n-1 the second, n-2… and the sum of that arithmetic sequence is n(n+1)/2 which is O(n^2).

#### How does the pivot selection and data arrangement affect execution time?

##### The pivot point determines whether the run time is the average, worst or best case scenario. If the pivot is always the median, it ensures that it will have a runtime of O(nlogn). 
