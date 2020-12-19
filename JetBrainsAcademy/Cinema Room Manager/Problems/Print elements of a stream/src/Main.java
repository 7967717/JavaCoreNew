import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    /**
     * Prints each element from a given stream except first 2 elements.
     *
     * @param stream the input stream of integers
     */
    public static void printStream(Stream<Integer> stream) {
        stream.skip(2L).forEach(System.out::println);
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printStream(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt));
    }
}