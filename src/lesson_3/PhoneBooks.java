package lesson_3;

import java.util.*;

public class PhoneBooks {
    private final Map<String, Set<String>> book;

    public PhoneBooks() {
        this.book = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (book.containsKey(name)) {
            book.get(name).add(phone);
        } else {
            Set<String> nambers = new HashSet<>();
            nambers.add(phone);
            book.put(name, nambers);
        }

    }

    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            return Collections.emptySet();
        }
    }

}
