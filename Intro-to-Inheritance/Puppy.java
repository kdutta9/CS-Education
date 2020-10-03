/** This class will help teach us about Java and inheritance. **/
public class Puppy extends Dog {

	/** Say something. **/
	public void speak() {
		System.out.print("Ruff!");
	}

	/** Fetch something. **/
	public void fetch() {
		System.out.print(name + " doesn't know how to fetch!");
	}
}
