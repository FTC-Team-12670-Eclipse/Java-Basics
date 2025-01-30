Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog {
//Attributes:
string name;
string breed;

//Constructor:
Dog(String dogName, String dogBreed) {
name = dogName;
breed = dogBreed;
    }
//Method:
void info() {
telemetry.addData(“Hello! My name is”+ name + “!”);
telemetry.addData(“I am a”+ breed + “!”);
telemetry.addData(“It’s nice to meet you!”);
telemetry.update();
    }
void setBreed(String newBreed) {
		this.breed = newBreed;
    }
void setName(String newName) {
		this.name = newName;
    }
}

//Main Program:
public class Main {
    public static void main(String[] args) {
        // Instances of “Dog”:
        Dog violet = new Dog("Violet", “Golden Retriever”);
        Dog rose = new Dog("Rose", “German Shepherd”);

        // Print original attributes
	  violet.info();
        rose.info();
	  // Modify attributes and print
	  violet.setBreed(“Poodle”);
	  rose.setName(“Ava”)
        violet.info();
        rose.info();
    }
}
	//It will print:
	Hello! My name is Violet!
	I am a Golden Retriever!
	It’s nice to meet you!

	Hello! My name is Rose!
	I am a German Shepherd!
	It’s nice to meet you!

Hello! My name is Violet!
	I am a Poodle!
	It’s nice to meet you!

	Hello! My name is Ava!
	I am a German Shepherd!
	It’s nice to meet you!
