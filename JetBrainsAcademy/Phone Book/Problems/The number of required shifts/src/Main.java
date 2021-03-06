import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] ints = new int[s];
        for (int i = 0; i < s; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(insertionSort(ints));
    }

    private static int insertionSort(int[] array) {
        int count = 0;
        /* iterating over elements in the unsorted part */
        for (int i = 1; i < array.length; i++) {
            int elem = array[i]; // take the next element
            int j = i - 1;

            if (elem > array[j]) {
                count++;
            }

            /* find a suitable position to insert and shift elements to the right */
            while (j >= 0 && array[j] < elem) {
                array[j + 1] = array[j]; // shifting
                j--;
            }
            array[j + 1] = elem; // insert the element in the found position in the sorted part
        }

        return count;
    }
}