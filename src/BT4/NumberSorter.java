package BT4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class NumberSorter {
    private final String filePath;

    public NumberSorter(String filePath) {
        this.filePath = filePath;
    }

    public void sortAndPrint() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.sort(numbers);
            for (int number : numbers) {
                System.out.println(number);
            }
            System.out.println("File read and sorted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}