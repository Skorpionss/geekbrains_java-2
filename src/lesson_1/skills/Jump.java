package lesson_1.skills;

public interface Jump {
    boolean jump(int distance);

    default void infoJump() {
        System.out.println("Я умею прыгать");
    }
}