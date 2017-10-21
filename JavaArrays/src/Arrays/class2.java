package Arrays;

public class class2 {

	public static void main(String[] args) {

		int[][] studentmarks = new int[10][4];

		// for first student
		studentmarks[0][0] = 78;
		studentmarks[0][1] = 90;
		studentmarks[0][2] = 80;
		studentmarks[0][3] = 75;
	
		// for second student
		studentmarks[1][0] = 75;
		studentmarks[1][1] = 100;
		studentmarks[1][2] = 80;
		studentmarks[1][3] = 94;

		// for third student
		studentmarks[2][0] = 90;
		studentmarks[2][1] = 85;
		studentmarks[2][2] = 94;
		studentmarks[2][3] = 100;

		for(int r=0; r<10; r++)
		{
		for(int c=0; c<4; c++)
		{
		
	System.out.println("studentmarks : ["+ r +"] ["+ c +"] =" + studentmarks [r][c]);
	
		
	}
		System.out.println("...................................");
		}
		System.out.println("...................................");
		
		
		
	}
}
