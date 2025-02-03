Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wingspan for birds. Implement methods to display pet details and calculate the pet's age in human years.
```java
class Pet {
    //Attributes:
	string name;
	string species;
	int age;

    //Constructor:
    Pet(String petName, string petSpecies, int petAge) {
        name = petName;
        species = petSpecies;
	    age = petAge;
    }

    //Method:
	void info() {
		telemetry.addData(“Hi!! I’m a” + species + “and my name is” + name + “I’m” + age + “years old!!”)
    }
}
//SUBCLASS DOG
class Dog extends Pet {
 //Attributes:
   string favorioteToy;
 //Constructor:
    Dog(String dogName, string dogSpecies, int dogAge, String toy) {
	    super(dogName, dogSpecies, dogAge);
        favorioteToy = toy;
    }
 //Method:
 int dogHumanYears() {
    return age * 7;
 }
}
//SUBCLASS BIRD
class Bird extends Pet {
 //Attributes:
   double wingspan;
 //Constructor:
    Bird(String birdName, string birdSpecies, int birdAge, Double birdWingspan) {
        super(birdName, birdSpecies, birdAge);
	    wingspan = birdWingspan;
    }
 //Method:
 int birdHumanYears() {
    return age * 15;
 }
}
