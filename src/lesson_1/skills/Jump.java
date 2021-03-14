package lesson_1.skills;

public interface Jump {
    boolean jump();
    default void infoJump () {
        System.out.println("Я умею прыгать");
    }
}