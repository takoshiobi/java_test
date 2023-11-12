import utils.StreamAPITasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = IntStream.generate(() -> new Random().nextInt(200)).limit(100).collect(ArrayList::new, List::add, List::addAll);

        try {
            StreamAPITasks.printList(numbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("List length: %s%n", StreamAPITasks.listLength(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Get first ten elements of sorted list: %s%n", StreamAPITasks.firstTenElemsOfSortedList(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Get last ten elements of sorted list: %s%n", StreamAPITasks.lastTenElemsOfSortedList(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Multiply each element of list by ten: %s%n", StreamAPITasks.multiplyListElemsByTen(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Add 2 to odd numbers of list: %s%n", StreamAPITasks.addTwoToOddNumbers(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Sum of list elements: %s%n", StreamAPITasks.sumOfListElems(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Check if given list contains numbers that are greater than 100: %s%n", StreamAPITasks.containsIntGreaterThan100(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Convert list to map: %s%n", StreamAPITasks.convertToMap(numbers));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}