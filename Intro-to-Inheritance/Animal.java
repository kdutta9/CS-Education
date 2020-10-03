/** This class will help teach us about Java and inheritance. **/
public class Animal {
	
	/** The amount of money in our Account. **/
	public String name;

	/** Define our class in the constructor. **/
	public Animal(String name0) {
		name = name0;
	}

	/** Eat some food. **/
	public void eat(String food) {
		System.out.print(name + " is eating " + food + ".");
	}

	/** Say something. **/
	public void speak() {
		System.out.print("");
	}
}
