package calculator;

public class mycalculator {

	int num1 = 10;
	int num2 = 20;

	public void addnums() {
		int result = num1 + num2;
		System.out.println("sum of " + num1 + "and " + num2 + result);
	}

	public void subnums() {
		int result = num2 - num1;
		System.out.println("sub of " + num1 + "and " + num2 + result);
	}

	public void mulnums() {
		int result = num1 * num2;
		System.out.println("mul of " + num1 + "and " + num2 + result);
	}

	public void divnums() {
		int result = num1 / num2;
		System.out.println("div of " + num1 + "and " + num2 + result);
	}

}
