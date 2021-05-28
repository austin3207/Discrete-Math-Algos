/**
* @author Austin Rogers
* @version 3/19/19
* 
* Math-1165 Project 2 
*
*Can calculate lattice paths of any size until the value exceeds the value that can be stored in a the largest variable
*/
import java.util.*;//imports scanner function for user input
public class latticePaths {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//allows use of the scanner function
		
		System.out.println("Enter a lattice size: ");
		int n = input.nextInt();//takes user input
		long [][] lattice = new long[n + 1][n + 1];//largest normal variable type
		int x = 0;//x,y coordinates for navigating the lattice
		int y = 0;
		
		while(x <= n) {
			while(y <= n ) {
				if(x == 0 || y == 0) {//creates edges of lattice
					lattice[x][y] = 1;
					y++;
				}
				else {
					lattice[x][y]= lattice[x-1][y] + lattice[x][y-1];//calculates the value at each point
					y++;
				}
				
			}
			x++;
			y = 0;
		}
		System.out.println("Total routes: " + lattice[n][n]);//outputs the final value of a n by n lattice
		input.close();//closes the scanner to eliminate a resource leak
	}

}
