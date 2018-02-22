# Three-Way-Partition-of-an-Array-around-a-given-range
Given an array and a range [lowVal, highVal], the array is partitioned around the range such that array is divided in three parts. 1) All elements smaller than lowVal come first. 2) All elements in range lowVal to highVVal come next. 3) All elements greater than highVVal appear in the end. The individual elements of three sets can appear in any order.

Examples:

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
        lowVal = 14, highVal = 20
Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
       lowVal = 20, highVal = 20       
Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54} 

This is a popular coding problem on various sites.

Solution: The idea is to use the partition method from the quick sort algorithm and use if twice on different sizes of the array so that the given problem is solved. If you know quick sort, the solution is not difficult to read but if you don't then study quick sort first or its partition method from https://www.geeksforgeeks.org/quick-sort/ 

More documentation and modifications or issues are more than welcomed!
