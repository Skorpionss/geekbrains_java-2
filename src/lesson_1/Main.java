package lesson_1;

import lesson_1.obstacles.Track;
import lesson_1.participants.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Track track = new Track();
        System.out.println(track.result(cat));
    }
}
