import java.sql.Array;
import java.util.Scanner;

public class CT5 {
		
    public static Scanner user = new Scanner(System.in);

	public static int Product(int i, int num) {
	
        if(i==0) return num;
        
        i--;
        int num2 = user.nextInt();
	    return num * Product(i, num2);
	}

	public static void main (String[] args) {
		System.out.println("Please enter 5 values: ");
		int num = user.nextInt();
		int prod = Product(4, num);
        System.out.println("Product: " + prod);
	
	}
}
