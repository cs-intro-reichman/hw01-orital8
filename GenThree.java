/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
        // enter 2 numbers 
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            //for finding the range between the upcoming random numbers i need to find which one is bigger
            int min = Math.min(a,b);
            int max = Math.max(a,b); 
            //range is important for finding the multiply number
            int range= max-min;
            int num1= (int)(Math.random()*range) + min;
            int num2= (int)(Math.random()*range) + min;
            int num3= (int)(Math.random()*range) + min;
            //min between first 2  random numbers
            int minimal= Math.min(num1,num2);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("The minimal generated number was "+ Math.min(minimal, num3));

                   }
        }

    
    
	
	

