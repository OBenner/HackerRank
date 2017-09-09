Given an array of integers, calculate which fraction of its elements are positive,
which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively.
Print the decimal value of each fraction on a new line.

<b>Note:</b> This challenge introduces precision problems.
The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

<b>Input Format</b>

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

<b>Output Format</b>

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.

<b>Sample Input</b>

6<br>
-4 3 -9 0 4 1    

<b>Sample Output</b>

0.500000<br>
0.333333<br>
0.166667<br>

<b>Explanation</b>
There are 3 positive numbers, 2 negative numbers, and  zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are
<i>3/6 = 0.500000, 2/6 = 0.333333 and 1/6= 0.166667 </i> , respectively.
