class Dog {
    // Attributes
    String name;
    String breed;

    // Constructor
    Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
    }

    // Method
    void bark() {
        System.out.println(name + " says: BARK!");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

// The actual program
public class Main {
    public static void main(String[] args) {
        // Create objects 
        Dog george = new Dog("George", "German Shepard");
        Dog jim = new Dog("Jim", "Pomeranian");

        // Use the objects
        george.bark(); 
        george.displayInfo();
        jim.displayInfo(); 
    }
}