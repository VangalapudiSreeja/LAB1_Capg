package day2Lab1;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n, value, value1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		n = sc.nextInt();
		FibonacciSeries fs = new FibonacciSeries();
		value = fs.recursive(n);
		System.out.println("The nth value using recursive function is "+value);
		value1 = fs.nonrecursive(n);
		System.out.println("The nth value using nonrecursive function is "+value1);
	}
	public int recursive(int n)
	{
		if(n <= 1)
			return n;
		else
			return recursive(n-1)+recursive(n-2);
	}
	public int nonrecursive(int n)
	{
		int prefib = 0, curfib = 1, newfib;
	    if(n <= 1)
	    {
		     return n;
	    }
	    for(int i=0;i<n-1;i++)
	    {
		    newfib = prefib+curfib;
		    prefib = curfib;
		    curfib = newfib;
	    }
	    return curfib;
	}

}
