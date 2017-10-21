package objectclass;

public class Puppy {

	public Puppy () {
		System.out.println("hi default puppy");
}
	public Puppy (String name) {
		System.out.println("hi"+ name);
	}
	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy ("tommy");
		Puppy myPuppy2 = new Puppy ();
				
	}
}

