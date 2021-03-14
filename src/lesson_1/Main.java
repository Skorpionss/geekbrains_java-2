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
                new Track(1000),
                new Wall(5)
        };

        Participants[] participants = {
                new Cat(3, 100),
                new Human(4, 2000),
                new Robot(10, 5000)
        };

        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].toString());
            for (int j = 0; j < obstacles.length; j++) {
                System.out.println(obstacles[j].result(participants[i]));
                if (!(obstacles[j].result(participants[i]))) {
                    break;
                }
            }
        }
    }
}
