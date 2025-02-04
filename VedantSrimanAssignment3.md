This is Vedant and Sriman's Solution to Assignment 3: 


Music Library Class
```
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.Random;

public class MusicLibrary {
    ArrayList<String> songs = new ArrayList<String>(Arrays.asList("Believer", "Die With a Smile", "Thunder"));

    Random random = new Random();

    public void addSong(String Song){
        songs.add(Song);
    }
    public void randomSong(){
        int randomIndex = random.nextInt(songs.size());
        String randomElement = songs.get(randomIndex);
        System.out.println(randomElement);
    }
    public void removeSong(String Song){
        songs.remove(Song);
    }
    public void printList(){
        System.out.println(songs);
    }


}

```
Main Program

```
public class Main{
     public static void main (String [] args){
         MusicLibrary library = new MusicLibrary();
         library.addSong("pompom");
         library.removeSong("Believer");
         library.randomSong();
         library.printList();
     }
}
```
