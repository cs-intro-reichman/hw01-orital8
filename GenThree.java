/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int mx= Math.max(a,b);
		int mn= Math.min(a,b);
		int randomNumber1 = (int) (Math.random() * (mx - mn + 1)) + mn;
		int randomNumber2 = (int) (Math.random() * (mx - mn + 1)) + mn;
		int randomNumber3 = (int) (Math.random() * (mx - mn + 1)) + mn;
		
		int random_min= Math.min( Math.min(randomNumber1,randomNumber2),randomNumber3);	
		
			System.out.println(randomNumber1);
			System.out.println(randomNumber2);
			System.out.println(randomNumber3);
			System.out.println("The minimal generated number was "+random_min);
		
	}
}
