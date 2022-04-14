/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

//        System.out.print("Enter number of inputs: ");
        int noOfInputs = sc.nextInt();
        int input = 0;
        for (int i = 1; i <= noOfInputs; i++) {
//            System.out.print("Enter input " + i + ": ");
            input = sc.nextInt();
            int addr = 0;
            while (input != 0) {
                addr *= 10;
                addr += input % 10;
                input = input / 10;
            }
//            System.out.println("Reversed number = " + addr);
            System.out.println(addr);
        }
	}
}
