package forloop;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int rows = sc.nextInt();

		for (int i = rows; i <= 1; i++) {
			for (int j = 1; j <= i; j++) {

		System.out.print(j+" ");		
			}

		}

	}
}
