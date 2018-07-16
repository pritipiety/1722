package factorial;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){
		System.out.println("Factorial using recursion");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is " + Fact.calfactorial(n));
	}

}
