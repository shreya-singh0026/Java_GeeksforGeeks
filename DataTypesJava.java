/*Working with Data Types is very important in programming world. Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: a (int), b (float), c (double), l (long), d (byte). Your task is to do step-wise operations as given below:
1. Divide c by b.
2. Divide b by a.
3. Divide c by a.
4. Add result at step 3 with l.
5. Divide a by d.

Example 1:

Input:
1 2 3 5 127

Output:
1.5 2.0 3.0 8.0 0

Exaplanation:
a=1, b=2, c=3, l=5, d=127
c/b=1.5
b/a=2.0
c/a=3.0
(c/a)+l=8.0
a/d=0
Example 2:

Input:
2 4 8 16 32

Output:
2.0 2.0 4.0 20.0 0

Exaplanation:
a=2, b=4, c=8, l=16, d=32
c/b=2.0
b/a=2.0
c/a=4.0
(c/a)+l=2.0
a/d=0
User Task:
Your task is to complete the provided function dataTypes() following the above given steps.

Constraints:
1 <= a, b, c <= 106
1 <= d <= 127
1 <= l <= 1018
*/
class Geeks{
    
    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d){
        
        double p =c/b ;//c/b
        double q =b/a ;//b/a
        double r = c/a;//c/a
        double m =r+l ;//r+l
        int s = a/d;//a/d
        
        //Printing all the results 
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
    }
}
