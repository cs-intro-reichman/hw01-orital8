/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); //number of cents
		int q = a/25; // number of quarters
		
		
		System.out.println("use "+q+" quarters "+"and "+(a-q*25)+ " cents");
		
		
	}
}