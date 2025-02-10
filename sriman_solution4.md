This is my solution to Assignment 4



PetActions Interface that defines 2 actions "sleep" and "eat", that are used by all pets
```
interface PetActions {
    void eat();
    void sleep();
}
```
Parent Class, "Pet", which implements the PetActions Interface
```
abstract class Pet implements PetActions {
    String name;

    Pet(String name) {
        this.name = name;
    }
    
    public abstract void eat(); 
    public abstract void sleep(); 
}
```

Subclass Bird which extends Pet
```
class Bird extends Pet {
    
    Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is chewing on a fruit!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in their nest!");
    }
}
```
Subclass Dog which extends Pet
```
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping!\n");
    }
}
```
Main Program
```
public class Main {
    public static void eatThenSleep(PetActions pet) {
        pet.eat();
        pet.sleep();
    }

    public static void main(String[] args) {
       
      
        Pet srimanDog = new Dog("bob the builder");
        Pet srimanBird = new Bird("mark the mailman");

        System.out.println("Dog Actions:");
        eatThenSleep(srimanDog);
        System.out.println("Bird Actions:");
        eatThenSleep(srimanBird);
    }
}
```
