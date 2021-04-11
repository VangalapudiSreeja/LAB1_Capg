package day2Lab1;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args)
	{
		int n;
		int m;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			m=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				m=1;
			}
			if(m==0)
				System.out.println(i);
		}
	}

}
