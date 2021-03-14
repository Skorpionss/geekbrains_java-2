package lesson_1.skills;

public interface Run {
    boolean run(int distance);

    default void infoRun() {
        System.out.println("Я умею бегать");
    }
}
