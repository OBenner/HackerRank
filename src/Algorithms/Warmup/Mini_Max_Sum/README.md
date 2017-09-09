Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

<b>Input Format</b>

A single line of five space-separated integers.

<b>Constraints</b>

Each integer is in the inclusive range [1, 10<sup>10</sup>].

<b>Output Format</b>

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated
by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

<b>Sample Input</b>

1 2 3 4 5

<b>Sample Output</b>

10 14

<b>Explanation</b>

Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 1, our sum is 2+3+4+5=14.<br>
If we sum everything except 2, our sum is 1+3+4+5=13.<br>
If we sum everything except 3, our sum is 1+2+4+5=12.<br>
If we sum everything except 4, our sum is 1+2+3+5=11.<br>
If we sum everything except 5, our sum is 1+2+3+4=10.<br>
As you can see, the minimal sum is 1+2+3+4=10 and the maximal sum is 2+3+4+5=14. <br>
Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
