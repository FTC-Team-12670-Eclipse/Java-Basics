This is my solution to Assignment 2




Parent Class - Pet
```
public class Pet {
    String name;
    String species;
    int age;
    
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println(name + " is a " + age + " year-old " + species + ".");
    }

    public int calculateAge() {
        return age;
    }

}
```

Child Class - Dog (which inherits properties from Pet)
```
class Dog extends Pet {
    String favoriteToy;

    Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite toy: " + favoriteToy);
    }

    @Override
    public int calculateAge() {
        return age * 7; 
    }
}
```

Child Class - Bird (which also inherits properties from Pet)
```
class Bird extends Pet {
    private double wingSpan; 

    public Bird(String name, int age, int wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingSpan + " meters.");
    }

    @Override
    public int calculateAge() {
        return age * 9; 
    }
}
```

Main Program
```
public class MainProgram {
    public static void main(String[] args) {
        
        Dog srimanDog = new Dog("Bob", 7, "bone");
        Bird srimanBird = new Bird("George", 4, 3);

        System.out.println("Dog:");
        srimanDog.displayDetails();
        System.out.println(srimanDog.name + " is " + srimanDog.calculateAge() + " years old\n");

        System.out.println("Bird:");
        srimanBird.displayDetails();
        System.out.println(srimanBird.name + " is " + srimanBird.calculateAge() + " years old");
    }
}
```
