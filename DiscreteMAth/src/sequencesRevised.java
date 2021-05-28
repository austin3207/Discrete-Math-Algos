/** 
 * @author Austin Rogers
 * Project 3: Sequences Revision
 * 
 */
import java.util.Scanner;

public class sequencesRevised {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int c = input.nextInt();//user inputs
		int d = input.nextInt();
		double[] a = new double[10];
		a[0] = input.nextInt();
		a[1] = input.nextInt();
		c = -c;					//main problem was not changing the value of C when it changed sides of the equation
								// resulting in the x^2 + cx - d = 0 instead of x^2 -cx-d
		a[2] = (c * a[1]) + (d * a[0]);
		
		double[] root = {0,0};//stores the roots 
		root[0] = (c * c - 4 * (-d));
		root[0] = Math.pow(root[0], .5);
		root[0] = (double)(-c + root[0])/ 2;
		
		root[1] = (double)(c * c - 4 * (-d));
		root[1] = Math.pow(root[1], .5);
		root[1] = (double)(-c - root[1])/ 2;
		
	
		
		double[] con = new double[2];
		if(root[1]!=root[0]) {//finds constants for distinct roots
		con[1] = (a[0] * root[0] - a[1]) / (root[0] - root[1]);
		con[0] = a[0] - con[1];
		}
		else {//repeated roots
		con[1] = a[1]/ root[0] - a[0];
		con[0] = a[0];
		}
		if((c * c + 4 * d) >= 0) {//checks if roots are real
			if(root[1] != root[0]) {// distinct roots
				System.out.println("a^n = " + con[0] + "(" + root[0] + ")^ n + " + con[1] + "(" + root[1] + ")^ n "  );
			}
			if(root[0] == root[1]) {//repeated roots
				System.out.println("a^n = " + con[0] + "(" + root[0] + ")^ n + " + con[1] + "* n(" + root[1] + ")^ n "  );
			}	
		}
		else {//checks for imaginary cases using given equation
			System.out.println("c^2 + 4d is not greater than or equal to 0");
		}
		input.close();

	}

}
