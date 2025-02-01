// Parent class: Animal
class Pet {
    // Properties: What all animals have
    String name;
    String species;
    int age;


    // Constructor: To create an animal
    public Pet(String petName, String petSpecies, int petAge) {
        name = petName;
        species = petSpecies;
        setAge(petAge);
    }

    // Method: What all animals can do
    
    public String toString(){
        return "My name is "+name + " I am a "+ species + " and I am " + age +" years old";
    }
    public void setAge(int petAge){
        age = petAge;
    }
    int calcHumanAge(){
        return age;
    }
}

// Child class: Dog (inherits from Animal)
class Dog extends Pet {
    String breed; 
    // Additional method: What only dogs can do
    public Dog(String dogName, String dogBreed, int age) {
        super(dogName, "Dog", age); 
        breed = dogBreed;
    }
    @Override
    public String toString(){
        return super.toString() + " and my breed is "+ breed;
    }
    @Override
    public int calcHumanAge(){
        return age * 7;
    }

}
class Bird extends Pet {
    // Additional method: What only dogs can do
    public Bird(String birdName, int age) {
        super(birdName, "Bird", age); // Call the parent class's constructor
    }

    @Override
    public int calcHumanAge(){
        return age * 4;
    }
}

// The actual program
class srihan_assignment2 {
    public static void main(String[] args) {
        Dog george = new Dog("George", "German Shepard", 8);
        Bird kiki = new Bird("Kiki", 7);
        System.out.println(george);
        george.calcHumanAge();
        System.out.println(kiki);
        kiki.calcHumanAge();   
    }
}
