package day2Lab1;
import java.util.Scanner;

public class SumofNumbers {
	public static void main(String[] args) {
		int n, sum;
		System.out.println("Enter the n value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		SumofNumbers obj = new SumofNumbers();
		sum = obj.calculateSum(n);
		System.out.println("Sum of number divisible by 3 and 5 are :" + sum);
	}
	public int calculateSum(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
				sum = sum+i;
			}
		    return sum;
		}
	}
	


