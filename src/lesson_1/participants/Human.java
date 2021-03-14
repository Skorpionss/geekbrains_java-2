package lesson_1.participants;

import lesson_1.skills.Jump;
import lesson_1.skills.Run;

public class Human implements Participants, Jump, Run {
    @Override
    public boolean jump() {
        return false;
    }

    @Override
    public boolean run() {
        return false;
    }
}