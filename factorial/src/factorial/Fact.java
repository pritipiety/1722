package factorial;

import java.util.Scanner;

public class Fact {

	public static int calfactorial(int n){
		System.out.println("n="+n);
		
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n*calfactorial(n-1));
		}
		
	}
	}


