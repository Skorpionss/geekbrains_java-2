package lesson_1.obstacles;

import lesson_1.participants.Participants;
import lesson_1.skills.Run;

public class Track implements Obstacles {
    public final int width;

    public Track(int width) {
        this.width = width;
    }

    @Override
    public boolean result(Participants participants) {
        if (participants instanceof Run) {
            return ((Run) participants).run(width);
        }
        return false;
    }
}
