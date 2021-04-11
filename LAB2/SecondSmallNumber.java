package LAB2;
import java.util.Scanner;

public class SecondSmallNumber {
	public static void main(String[] args) {
		SecondSmallNumber sm = new SecondSmallNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(sm.getSecondSmallest(a,n));
	}

	public int getSecondSmallest(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]<a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		return a[1];
	}

}
