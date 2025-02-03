Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

I've considered the HashMap, but this version was simpler.

```java
class MusicLibrbary {
    ArrayList <String> Songs = new ArrayList <String>();
    public void add(String song) {
        if (Songs.contains(song)) {
            return();
        }
        else {
            Songs.add(song);
        }
    }
    public void remove(String song) {
        Songs.remove(song);
    }
    public void play() {
        Random random = new Random();
        int ix = random.nextInt(Songs.size());
           // Example of index:
           [ "A", "Banana", "Dog" ]
           ix  0       1       2
        return Songs.get(ix);
    }
    play();
}
