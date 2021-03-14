package lesson_1.skills;

public interface Jump {
    default void infoJump () {
        System.out.println("Я умею прыгать");
    }
}