package lesson_1.participants;

import lesson_1.skills.Jump;
import lesson_1.skills.Run;

public class Robot implements Participants, Jump, Run {
    public final int maxJump;
    public final int maxRun;

    public Robot(int maxJump, int maxRun) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(int distance) {
        return maxJump >= distance;
    }

    @Override
    public boolean run(int distance) {
        return maxRun >= distance;
    }

    @Override
    public String toString() {
        return "Участник Robot";
    }
}
