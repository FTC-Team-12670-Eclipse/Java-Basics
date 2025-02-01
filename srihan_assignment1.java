class Dog {
    // Attributes
    String name;
    String breed;

    // Constructor
    Dog(String dogName, String dogBreed) {
        setName(dogName);
        setBreed(dogBreed);
    }

    // Method
    void bark() {
        System.out.println(name + " says: BARK!");
    }

    public String toString(){
        return "Name: " + name + ", Breed: " + breed;
    }
    void setName (String dogName){
        name = dogName;
    }
    void setBreed (String dogBreed){
        breed = dogBreed;
    }
}

// The actual program
class srihan_assignment1{
    public static void main(String[] args) {
        // Create objects 
        Dog george = new Dog("George", "German Shepard");
        Dog jim = new Dog("Jim", "Pomeranian");

        // Use the objects
        george.bark(); 
        System.out.println(george);
        System.out.println(jim);

    }
}