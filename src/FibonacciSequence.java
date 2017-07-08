/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Fibonacci sequence
 *    Duration=00
 *    Platform=Eclipse
 *    Type=Teacher
 *    Objectives=Challenging logic
 *    
 *    
 ******************************************************************************/

/** 
Print the first 12 numbers of the Fibonacci sequence			
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144		
*/
public class FibonacciSequence {
  public static void main(String[] args) {
	int i = 0;
	int a = 0;
	int b = 1;
	System.out.println(a);
	System.out.println(b);
	for (int j = 0; j < 145; j++) {
	 i = a;
	 a = b;
     b = i + b;
	 System.out.println(a);
	}
  }
}
