package Modifier;

public class Modex1 {

	public void printPublic() {
		System.out.println("This is public method");
	}
	private void printprivate() {
		System.out.println("This is private method");
	}
	protected void printprotected() {
		System.out.println("This is protected method");
	}
	
	public static void main(String[] args) {
		Modex1 mt = new Modex1 ();
		mt.printPublic();
		mt.printprivate();
		mt.printprotected();
		
	
	}
}
