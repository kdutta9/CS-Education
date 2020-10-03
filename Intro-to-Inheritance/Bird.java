/** This class will help teach us about Java and inheritance. **/
public class Bird extends Animal {
	
	/** Eat some food. **/
	public void eat(String food) {
		if (food == "nuts") {
			System.out.print(name + " is eating.");
		} else {
			System.out.println(name + " doesn't eat " + food + ".");
		}
	}

	/** Say something. **/
	public void speak() {
		System.out.print("Caw!");
	}

	/** Fly somewhere. **/
	public void fly(String location) {
		System.out.print(name + " is flying to " + location + "!");
	}
}
