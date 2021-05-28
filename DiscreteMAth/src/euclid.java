/**
* @author Austin Rogers
* @version 2/15/19
* 
* Math-1165 Project 1
*
*/

import java.util.*;

public class euclid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//allows use of the scanner method
		
		System.out.println("Enter two numbers: ");//takes any 2 numbers from the user
		int x = input.nextInt();
		int y = input.nextInt();
		int[] div_store = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//stores the division result for the linear combination later
		int[] rem_store = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//stores the remainder
		
		int count = 0;
		if( x < 0) {//converts x to a positive integer
			x = x / (-1);
		}
		
		if( y < 0) {//converts y to positive integer
			y = y / (-1);
		}
		if(x > y) {//insures y is the greater number
			int temp = x;
			x = y;
			y = temp;
		}
		int[] x_next = {x, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//checks for a zero value which automatically makes the GCD the other value
		if(x == 0){//checks if x is 0
			System.out.println("GCD: " + y);
		}
		else if(y == 0 && x != 0) { // checks if y is zero and x is not
			System.out.println("GCD: " + x);
		}
		//first step
		else {
		div_store[0] = y / x;
		rem_store[0] = y % x;
		//continues until the remainder is 0
		while(rem_store[count] != 0){//checks if last remainder was 0
			div_store[count+1] = x_next[count] / rem_store[count];//stores the division value for later use
			rem_store[count+1] = x_next[count] % rem_store[count]; //stores next remainder
			x_next[count+1] = rem_store[count];//stores next x value for the next step
			
			
			count++;//increments the loop and tracks the GCD value
		}
		int gcd = x_next[count];
		System.out.println("GCD: " + gcd);//outputs the GCD
		
		/** BONUS
		int v = 0;
		int count2 = 1;
		while(count2 < count) {
			v = v + div_store[count2];
			count2++;
		}
		int u = 1;
		if(gcd == x) {
			v = 1;
			u = (gcd -(y * (v))) / x;
			System.out.println(u + "  " + v);
		}
		else if(gcd == 1) {
			v = 1;
		}
		else {
		u = (gcd -(y * (v))) / x -1;
		System.out.println(u + "  " + v);
		}
		
		*/
		input.close();
		}
	}
}
