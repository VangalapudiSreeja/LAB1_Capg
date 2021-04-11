package day2Lab1;
import java.util.Scanner;

public class CheckPower {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		CheckPower obj=new CheckPower();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(obj.checkNumber(n))
			System.out.println("It is a power of 2");
		else
			System.out.println(" It is not a power of 2");
			
	}
	
	
	public boolean checkNumber(int n) {
		if(n%2==0)
			return true;
		else 
			return false;
	}

}
