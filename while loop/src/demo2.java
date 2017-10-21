import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int num = sc.nextInt();

		int sum = 0;
		int i = 0;
		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of first " + num + " digits is = " + sum);

	}

}
