# merge-sort

The repo contains an implementation of the merge-sort algorithm in java.

With a worst-case running time of O(lgn) ignoring constants and lower-order items, the merge-sort algorithm is a a tad faster than the inserstion and selection sort which has a running time of 0(n*n);

To fully understand the merge sort, you'll need a basic to intermediate experience or understanding of recursion in programs.

# Merge-Sort Explained
Given an array: A

Given index range to sort: p...r;

The merge sort uses the divide-and-conquer method to split the array into two to find the midpoint of the array.
It does so recursively until a base case is reached. In merge sort, the base case is reached when the left an array contains 0 or 1 element.
if it contains just an element, it means it's sorted and it performs the merge;

In recursion, the recursive function is performed and it's logic is stored in memory;
Once the bases case is reached, the program carries out the all the merges for each sort function that has been stored in memory starting from the smallest to the largest split returning sorted halves on each merge until the full merge is reached.

Consider exploring <a href="https://www.tutorialspoint.com/cprogramming/c_recursion.htm">recurssion</a>

# Algorithm

<p>MERGE-SORT(A,p,r)</p>
<p>&emsp;  if(p < r) </p>
<p>&emsp; &emsp;    m = r/2</p>
<p>&emsp; &emsp;   MERGE-SORT(A,p,m)</p>
<p>&emsp; &emsp;   MERGE-SORT(A,m + 1, r)</p>
<p>&emsp; &emsp;   MERGE(A,p,m,r)</p>
<p>END;</p>
