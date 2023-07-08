/*There are times when your answer is a floating point that contains undesired amount of digits after decimal. Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point.
Note: You may use System.out.format()

Example 1:

Input:
5.43 2.653

Output:
2.046739 2.047
Example 2:

Input:
3.25 2.5

Output:
1.3 1.300
User Task:
Your task is to complete the provided function printInFormat().
Note: You don't need to give a new line character after using System.out.format().

Constraints:
1 <= a, b,<= 100
/*
class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
                System.out.format(result + " ");
                System.out.format("%.3f",result);
    }    
    
}
