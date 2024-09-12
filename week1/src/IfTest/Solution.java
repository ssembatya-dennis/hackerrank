import java.util.*;

/*
 * Task
Given an integer N, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
 */


public class Solution {
    
    // declare scanner object instance constant that provides methods to 
    // read and access data entered in the System
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // declare a variable N that stores an integer value received
        // from the standard system Input stream System.in 
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // when N is odd
        if (N % 2 != 0) {
            System.out.println("Weird");
        }
        
        // when N is even and in the inclusive range of 2 to 5
        if (N % 2 == 0 && (N >= 2 && N <= 5)) {
            System.out.println("Not Weird");
        }
        
        // when N is even and in the inclusive range of 6 to 20
        if (N % 2 == 0 && (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        }
        
        // when N is even and greater than 20
        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
