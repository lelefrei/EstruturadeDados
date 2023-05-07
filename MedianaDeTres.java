
package exercicio05java;

import java.util.Arrays;


public class MedianaDeTres {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particiona(array, inicio, fim);
            quickSort(array, inicio, indicePivo - 1);
            quickSort(array, indicePivo + 1, fim);
        }
    }

    private static int particiona(int[] array, int inicio, int fim) {
        int pivo = escolhePivo(array, inicio, fim);
        int indiceMenor = inicio;

        for (int i = inicio + 1; i <= fim; i++) {
            if (array[i] < pivo) {
                indiceMenor++;
                troca(array, i, indiceMenor);
            }
        }

        troca(array, inicio, indiceMenor);
        return indiceMenor;
    }

    private static int escolhePivo(int[] array, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int a = array[inicio];
        int b = array[meio];
        int c = array[fim];

        if (a > b) {
            troca(array, inicio, meio);
            a = array[inicio];
            b = array[meio];
        }

        if (b > c) {
            troca(array, meio, fim);
            b = array[meio];
            c = array[fim];
        }

        if (a > b) {
            troca(array, inicio, meio);
            a = array[inicio];
            b = array[meio];
        }

        return b;
    }

    private static void troca(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        int[] array = {3, 5, -12, 34, 91, 81, 91, 2, 0, 180, 21, 76, 22, 20, 19, 43, -15, 1, 65};
        quickSort(array);
        System.out.println(Arrays.toString(array)); 
    }
}


