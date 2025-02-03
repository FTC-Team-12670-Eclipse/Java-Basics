Assignment 1 :

Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

This class represents a dog and the characteristics defined in the dog class, like name and breed 

```
public class Dog {
    public String dogName;
    public String dogBreed;
    
    public Dog(String dogName, String dogBreed) {
        this.dogName = dogName; //variable for dogs name
        this.dogBreed = dogBreed; //variable for dogs breed
    }
    public String toString() { 
        return dogName + " is a " + dogBreed;
    }  
}
```


Main Program

```
public class DogTest {
    public static void main(String[] args) {

        System.out.println("OLD VALUES:");
        
        //set values
        Dog firstDog = new Dog("Lily", "Golden Retriever");
        Dog secondDog = new Dog("Lucky", "Bulldog");
       
        //print original values
        System.out.println(firstDog);
        System.out.println(secondDog);
       
        //modify the variable dogName and dogBreed
        firstDog.dogBreed = "Poodle";
        firstDog.dogName = "Mark";
        secondDog.dogBreed = "Labrador";
        secondDog.dogName = "Marco";
    
        //print new values
        System.out.println("\nNEW VALUES:");
        System.out.println(firstDog);
        System.out.println(secondDog);
        
    }
}
```
