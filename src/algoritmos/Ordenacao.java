package algoritmos;

import java.util.Arrays;

public class Ordenacao {

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4};
        System.out.println("Antes: " + Arrays.toString(vetor));

        bubbleSort(vetor);

        System.out.println("Depois: " + Arrays.toString(vetor));
    }

    public static void bubbleSort(int[] arr) {
        int i, j, n = arr.length - 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
