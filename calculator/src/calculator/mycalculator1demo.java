package calculator;

public class mycalculator1demo {

	public static void main(String[] args) {
		
		mycalculator1 cal = new mycalculator1();
				int sum = cal.addnums (10 , 20);
				int sub = cal.subnums (10 , 20);
				int mul = cal.mulnums (10 , 20);		
				int div = cal.addnums (10 , 20);
		
		
		System.out.println("sum of values = " + sum);
		System.out.println("sum of values = " + sub);
		System.out.println("sum of values = " + mul);
		System.out.println("sum of values = " + div);
	}
}

