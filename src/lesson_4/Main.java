package lesson_4;

import java.lang.annotation.Target;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        doTask4();
    }

    static void doTask1() {
        List<Integer> listnamber = new ArrayList<>();

        listnamber.add(1);
        listnamber.add(2);

        listnamber.forEach(integer -> {
            System.out.println(integer);
        });
    }

    static void forItem(Set<String> ss, Consumer<String> cs) {
        Iterator<String> iterator = ss.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            cs.accept(val);
        }
    }

    static void doTask2() {
        Set<String> mass = new HashSet<>();

        mass.add("stroka 1");
        mass.add("stroka 2");

        forItem(mass, string -> System.out.println(string));
    }

    static int doubleUp(int i, Supplier<Integer> sl) {
        return i * sl.get();
    }

    static void doTask3() {
        System.out.println(doubleUp(10, () -> 5));
    }

    static Optional<String> findAllChars(String target, char toFind) {
        char[] chars = target.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == toFind) stringBuilder.append(toFind);
        }
        if (stringBuilder.length() > 0) return Optional.of(stringBuilder.toString());
        return Optional.empty();
    }

    static void doTask4() {
        System.out.println(findAllChars("ccch", 'c').get());
    }
}

