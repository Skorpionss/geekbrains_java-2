package lesson_1.obstacles;

import lesson_1.participants.Participants;
import lesson_1.skills.Jump;

public class Wall implements Obstacles{
    @Override
    public boolean result(Participants participants) {
        if (participants instanceof Jump){
            return ((Jump) participants).jump();
        }
        return false;
    }
}
