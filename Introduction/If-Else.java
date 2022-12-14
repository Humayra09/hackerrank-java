/*
Task
Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of  6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer,n.

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
*/
import java.util.*;

class if_else {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("enter a number");
        int N = sc.nextInt();
         
        if(N % 2 == 1){             //if n is an odd number print weird
            System.out.println("Weird");
        }
        else if(N>=2 && N<=5){      //if n is even and is in inlusive range of 2 and 5 print not weird
            System.out.println("Not Weird");
        }
        else if(N>=6 && N<=20){      // if n is even and is in inlusive range of 6 and 20 print weird
            System.out.println("Weird");
        }
        else{                       //if n is even and greater than 20 print not weird
            System.out.println("Not Weird");
        }

        }

    }
    
    
