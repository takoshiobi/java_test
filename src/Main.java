import Utils.StreamAPITasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = IntStream.generate(() -> new Random().nextInt(200)).limit(100).collect(ArrayList::new, List::add, List::addAll);

        try {
            System.out.printf("Array length: %s%n", StreamAPITasks.arrayLength(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Get first ten elements: %s%n", StreamAPITasks.firstTen(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Get last ten elements: %s%n", StreamAPITasks.lastTen(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Multiply each element by ten: %s%n", StreamAPITasks.multiplyTen(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Add 2 to odd numbers: %s%n", StreamAPITasks.oddAddTwo(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Sum of array elements: %s%n", StreamAPITasks.arraySum(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Check if array contains numbers that are greater than 100: %s%n", StreamAPITasks.containsIntGreaterThan100(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Convert array to map: %s%n", StreamAPITasks.convertToMap(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}