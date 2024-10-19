import java.util.Arrays;
import java.util.Random;

public class SortingTest {

    public static void main(String[] args) {
        int[] array = generateRandomArray(10000);

        // Тестируем сортировку пузырьком
        int [] arrayForBubble = Arrays.copyOf(array, array.length);
        long startTime = System.nanoTime();
        SortingAlgorithms.bubbleSort(arrayForBubble);
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ns");

        // Тестируем сортировку выбором
        int[] arrayForSelection = Arrays.copyOf(array, array.length);
        startTime = System.nanoTime();
        SortingAlgorithms.selectionSort(arrayForSelection);
        endTime = System.nanoTime();
        System.out.println("Selection Sort Time: " + (endTime - startTime) + " ns");

        // Тестируем сортировку вставками
        int[] arrayForInsertion = Arrays.copyOf(array, array.length);
        startTime = System.nanoTime();
        SortingAlgorithms.insertionSort(arrayForInsertion);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ns");

        // Тестируем быструю сортировку
        int[] arrayForQuick = Arrays.copyOf(array, array.length);
        startTime = System.nanoTime();
        SortingAlgorithms.quickSort(arrayForQuick, 0, arrayForQuick.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort time: " + (endTime - startTime) + " ns");
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000); // случайные числа от 0 до 9999
        }
        return array;
    }
}