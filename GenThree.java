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
		int range= mx-mn;
		int randomNumber1 = (int) (Math.random() * (range) + mn;
		int randomNumber2 = (int) (Math.random() * (range) + mn;
		int randomNumber3 = (int) (Math.random() * (range) + mn;
		
		int random_min= Math.min( Math.min(randomNumber1,randomNumber2),randomNumber3);	
		
			System.out.println((randomNumber1)+"\n"+(randomNumber2)+"\n"+(randomNumber3)+"\n"+
													("The minimal generated number was "+random_min));
		
	}
}
