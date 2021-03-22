package lesson_3;

public class Main {
    public static void main(String[] args) {
        SummaSlovMassiv summaSlovMassiv = new SummaSlovMassiv();
        summaSlovMassiv.summa();

        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.add("Максим", "+7(913)880-80-80");
        System.out.println(phoneBooks.get("Максим"));
    }
}
