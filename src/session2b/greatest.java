		// PROGRAM TO PRINT GREATEST OF THREE NUMBERS
package session2b;
		// IMPORT SCANNER CLASS FOR USER INPUT
import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		// ENTER THREE NUMBER
		int a,b,c;
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter three number");
        // ASSIGNNING VALUE 	
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		// CONDITION TO CHECK GREATEST NUMBER
		System.out.println("greatest no is ");
		// USE OF AND OPERATOR
		if(a>b&&b>c)
			System.out.println(a);
		else if(b>c&&b>a)
			System.out.println(b);
		else
		    System.out.println(c);
		obj.close();
	}

}
