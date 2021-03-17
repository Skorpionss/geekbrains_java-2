package lesson_2;

public class Main {
    public static void main(String[] args) {
        DigitCalculator digitCalculator = new DigitCalculator();
        Massiv massiv = new Massiv();
        int summ = digitCalculator.calc(massiv.mass4());
        System.out.println(summ);
    }
}
