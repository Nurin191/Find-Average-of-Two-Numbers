import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N1 = input.nextInt();
		int N2 = input.nextInt();
		
		//Typecasting for R 
		double R = (double) (N1 + N2)/2;
		
		System.out.println("The average of two numbers is: " + R);
		
		input.close();
		
		
	}

}

