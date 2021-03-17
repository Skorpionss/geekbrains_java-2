package lesson_2;

public class DigitCalculator {
    public int calc(String[][] massiv) {
        if (massiv.length != 4) {
            throw new MyArraySizeException("Не является массивом 4x4");
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i].length != 4) {
                throw new MyArraySizeException("Не является массивом 4x4");
            }
        }
        int summ = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                try {
                    summ += Integer.parseInt(massiv[i][j]);
                } catch (NumberFormatException ex) {
                    String message = String.format("Неверный формат в массиве [%s][%s]", i, j);
                    throw new MyArrayDataException(message, ex);
                }
            }
        }
        return summ;
    }
}
