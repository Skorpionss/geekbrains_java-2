package lesson_2;

public class DigitCalculator {
    public void calc(String[][] massiv) {
        if (massiv.length != 4) {
            throw new MyArraySizeException("Не является массивом 4x4");
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i].length != 4) {
                throw new MyArraySizeException("Не является массивом 4x4");
            }
        }
    }
}
