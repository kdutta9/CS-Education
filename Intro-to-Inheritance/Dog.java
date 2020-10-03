/** This class will help teach us about Java and inheritance. **/
public class Dog extends Animal {
	
	/** Eat some food. **/
	public void eat(String food) {
		if (food == "meat") {
			System.out.print(name + " is eating.");
		} else {
			System.out.println(name + " doesn't eat " + food + ".");
		}
	}

	/** Say something. **/
	public void speak() {
		System.out.print("Bark!");
	}

	/** Fetch something. **/
	public void fetch() {
		System.out.print(name + " is fetching a stick!");
	}
}
