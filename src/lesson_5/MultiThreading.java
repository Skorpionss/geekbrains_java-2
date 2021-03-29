package lesson_5;

import java.util.Arrays;

public class MultiThreading {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];


    public void NoThreading() {
        Arrays.fill(arr, 1); // Заполняем массив 1
        long times = System.currentTimeMillis();
        Mathimatica(arr);
        long finaltimes = System.currentTimeMillis() - times;
        System.out.println("Без многопоточности = " + finaltimes);
    }

    public void Threading() {
        Arrays.fill(arr, 1);

        long times = System.currentTimeMillis();

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        new Thread(() -> Mathimatica(arr1)).start();
        new Thread(() -> Mathimatica(arr2)).start();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        long finaltimes = System.currentTimeMillis() - times;

        System.out.println("Многопоточность = " + finaltimes);
    }

    private void Mathimatica(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
