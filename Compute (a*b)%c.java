/*
Given three numbers a, b and c such that a, b and c can be at most 1016. The task is to compute (a*b)%c

Example 1:

Input: a = 4, b = 3, c = 5
Output: 2
Explanation: (4 * 3) = 12 and
12 % 5 = 2
Example 2:

Input: a = 1000000000007,
b = 10000000000005, c = 1000000000000003
Output: 972978359410049
Explanation: You can calculate it by youself.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function mulMod() which takes a, b, c as inputs and returns the answer.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ a, b, c ≤ 1016
 */

class Solution{
    static long mulMod(long a, long b, long c){
        long res= (a%c)*(b%c);
        return res%c;
    }
}
