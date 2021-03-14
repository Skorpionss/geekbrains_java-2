package lesson_1;

import lesson_1.obstacles.Obstacles;
import lesson_1.obstacles.Track;
import lesson_1.obstacles.Wall;
import lesson_1.participants.Cat;
import lesson_1.participants.Human;
import lesson_1.participants.Participants;
import lesson_1.participants.Robot;

public class Main {
    public static void main(String[] args) {

        Obstacles[] obstacles = {
                new Track(),
                new Wall()
        };

        Participants[] participants = {
                new Cat(),
                new Human(),
                new Robot()
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                System.out.println(obstacles[j].result(participants[i]));
            }
        }
    }
}
