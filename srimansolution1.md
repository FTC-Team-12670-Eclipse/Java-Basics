Assignment 1 :

Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.



This class represents a dog and the characteristics defined in the dog class, like name and breed 

```
public class Dog {
    String dogName;
    String dogBreed;
    
    public Dog(String dogName, String dogBreed) {
        this.dogName = dogName; //variable for dogs name
        this.dogBreed = dogBreed; //variable for dogs breed
    }
    
    public void setBreed(String dogBreed) {
        this.dogBreed = dogBreed; //alows breed to be updated
    }
    
    public void setName(String dogName) {
        this.dogName = dogName; //allows name to be updated
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
        System.out.println(firstDog.dogName +  " is a " + firstDog.dogBreed);
        System.out.println(secondDog.dogName +  " is a " + secondDog.dogBreed);
        
        //update values using setBreed and setName methods
        firstDog.setBreed("Poodle");
        firstDog.setName("Mark");
        secondDog.setBreed("Labrador");
        secondDog.setName("Marco");
    
        //print new values
        System.out.println("\nNEW VALUES:");
        System.out.println(firstDog.dogName +  " is a " + firstDog.dogBreed);
        System.out.println(secondDog.dogName +  " is a " + secondDog.dogBreed);
    }
}
```
