package lesson_1.obstacles;

import lesson_1.participants.Participants;
import lesson_1.skills.Run;

public class Track implements Obstacles{
    @Override
    public boolean result(Participants participants) {
        if (participants instanceof Run){
        return ((Run) participants).run();
        }
        return false;
    }
}
