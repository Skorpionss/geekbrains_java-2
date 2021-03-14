package lesson_1.obstacles;

import lesson_1.participants.Participants;
import lesson_1.skills.Jump;

public class Wall implements Obstacles {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean result(Participants participants) {
        if (participants instanceof Jump) {
            return ((Jump) participants).jump(height);
        }
        return false;
    }
}
