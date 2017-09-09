You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

<b>Input Format</b>

The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

<b>Output Format</b>

Print a single value equal to the sum of the elements in the array.

<b>Constraints</b> : 1 <= N <= 10 ; 0 <= A[i] <= 10<sup><small>10</small></sup>
 

<b>Sample Input</b>

5<br>
1000000001 1000000002 1000000003 1000000004 1000000005

<b>Output</b>

5000000015

<b>Note:</b>

The range of the 32-bit integer is [-2147483648,2147483647] .
When we add several integer values, the resulting sum might exceed the above range. 
You might need to use long long int in C/C++ or long data type in Java to store such sums.
