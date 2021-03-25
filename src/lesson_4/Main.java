package lesson_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        doTask1();
    }

    static void doTask1() {
        List<Integer> listnamber = new ArrayList<>();

        listnamber.add(1);
        listnamber.add(2);

        listnamber.forEach(integer -> {
            System.out.println(integer);
        });
    }
}

