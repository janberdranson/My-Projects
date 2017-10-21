import java.util.Scanner;

public class demo4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int num = sc.nextInt();

		int i = 0;
		do {
			System.out.println("hi :" + i);
			i++;
		} while (i < 10);

	}
}
