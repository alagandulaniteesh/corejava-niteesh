package loops;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		int total=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int n=sc.nextInt();
		for(int i=1;i<=n/2;i++) {
			if (n%i==0) {
				System.out.print(i+" ");
				total=total+i;
			}
			}
		if(total==n) {
			System.out.println("\nperfect Number");
		}
	}

}
