In continuity with assignment2 - How would you enforce each subclass of Pet to implement eat() and sleep() methods? Think about designing an interface contract that ensures all pet types follow these behaviors. Define an interface called PetBehavior and demonstrate how it fits with the Pet, Dog, and Bird classes.

```java
//Interface:
interface IPetBehavior {
    void Eat();
    void Sleep();
}

// Interface with Pet, Dog, and Brid classes:
class Pet implements IPetBehavior {
    public void Eat()
    public void Sleep()
}

class Dog implements IPetBehavior {
    public void Eat() { System.out.println("Puppy is eating bannanas! Yum!!"); }
    public void Sleep() { System.out.println("Puppy is sleeping! Shhhhh!"); }
}

class Bird implements IPetBehavior {
    public void Eat() { System.out.println("Bird is eating food! Yum!!"); }
    public void Sleep() { System.out.println("Bird is sleeping! Shhhhh!"); }
}

// Main Program:
public class Main {
    public void eatThenSleep(IAnimal a) {
        a.Eat();
        a.Sleep();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        eatThenSleep(dog);
        eatThenSleep(bird);
    }
}