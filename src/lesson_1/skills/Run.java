package lesson_1.skills;

public interface Run {
    boolean run();
    default void infoRun () {
        System.out.println("Я умею бегать");
    }
}
