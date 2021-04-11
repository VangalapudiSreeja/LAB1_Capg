package day2Lab1;
import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		Difference obj = new Difference();
		int res = obj.Difference(n);
		System.out.println("The calculate difference is :"+res);

	}
	public int Difference(int n) {
		int diff=0;
		int sumOfSquares = (n*(n+1)*(2*n+1))/6;
		int sum = n*(n+1)/2;
		int squareOfSum = (int) Math.pow(sum, 2);
		diff = sumOfSquares-squareOfSum;
		return diff;
	}

}
