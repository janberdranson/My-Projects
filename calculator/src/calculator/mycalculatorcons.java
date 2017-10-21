package calculator;

public class mycalculatorcons {

	static int num1, num2;

	public mycalculatorcons(int x, int y) {

		num1 = x;
		num2 = y;
	}
		public static int addnums () {
			int result = num1 + num2;
			return result;
		}
		public static int subnums () {
			int result = num2 - num1;
			return result;
		}
		public static int mulnums () {
			int result = num1 * num2;
			return result;
		}
		public static int divnums () {
			int result = num1 / num2;
			return result;
		}
		public void printsummary () {
			System.out.println("sum is = " + addnums());
			System.out.println("sum is = " + subnums());
			System.out.println("sum is = " + mulnums());
			System.out.println("sum is = " + divnums());
		}
		
	}
