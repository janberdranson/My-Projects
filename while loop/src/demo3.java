import java.util.Scanner;

public class demo3 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter your number:");
			int num = sc.nextInt();
			
		
			int multi = 1 ;
			int i = 1 ;
			while (i <=num ) {
				multi = multi * i;
				i++;
			}
			System.out.println("Production of first " + num + " digits is = " + multi);

			
			
		}

}