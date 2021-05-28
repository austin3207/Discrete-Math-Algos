/** 
 * @author Austin Rogers
 * Project 3: Sequences
 * 
 */
import java.util.*;
public class sequences {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int c = input.nextInt();//user inputs
		int d = input.nextInt();
		int[] a = new int[10];
		a[0] = input.nextInt();
		a[1] = input.nextInt();
		c = -c;
		
		a[2] = (c * a[1]) + (d * a[0]);
		
		double[] root = {0,0};//stores the roots 
		root[0] = (c * c - 4 * (-d));
		root[0] = Math.pow(root[0], .5);
		root[0] = (double)(-c + root[0])/ 2;
		
		root[1] = (double)(c * c - 4 * (-d));
		root[1] = Math.pow(root[1], .5);
		root[1] = (double)(-c - root[1])/ 2;
		
		double[] con = {0, 0};// stores constants for the equation
		System.out.println(root[0] + " " + root[1]);
		con[0] = a[1] - (a[0] * root[1]);
		con[0] = con[0] / (root[0] - root[1]);
		
		con[1] = -a[1] + a[0] * root[0];
		con[1] = con[1] / (root[0]-root[1]);
		
		if(c * c +4 * d >= 0 && root[0] != root[1]) {
		System.out.println("a^n = " + con[0] + "(" + root[0] + ")^ n + " + con[1] + "(" + root[1] + ")^ n "  );
		}
		else if(root[0] == root[1]) {
			System.out.println("a^n = " + con[0] + "(" + root[0] + ")^ n + " + con[1] + "* n(" + root[1] + ")^ n "  );
		}
		else {
			System.out.println(" This is invalid input since c^2 + 4d ia not greater than or equal to 0.");
		}
		
		
		
		
		input.close();

	}

}
