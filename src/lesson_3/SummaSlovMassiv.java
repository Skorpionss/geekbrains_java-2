package lesson_3;

import java.util.*;

public class SummaSlovMassiv {
    String[] word = {"дом", "магазин", "дом", "собака", "кошка", "телевизор", "окно", "кошка", "дом", "стул"};

    public void summa() {
        System.out.println("Входной массив");
        System.out.println(Arrays.asList(word));

        System.out.println("Вывод список уникальных слов");
        Set<String> Word = new HashSet<>(Arrays.asList(word));
        System.out.println(Arrays.asList(Word));

        System.out.println("Считаем сколько раз встречается слово");
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (counter.containsKey(word[i])) {
                counter.put(word[i], counter.get(word[i]) + 1);
            } else {
                counter.put(word[i], 1);
            }

        }
        System.out.println(counter);
    }
}


