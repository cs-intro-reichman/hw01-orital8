/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public classTriangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean fix =((a+b)>c && (b+c)>a && (c+a)>b);
			{
				System.out.println( a +",  "+ b+",  "+c+": "+ fix);
			}	
			
	}
}
