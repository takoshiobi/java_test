import Utils.Tasks;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BigInteger task1_res = Tasks.addition();
        System.out.printf("Addition of big integers result: %d%n", task1_res);

        Integer task2_res = Tasks.division();
        System.out.printf("Division result: %d%n", task2_res);

        try {
            String task3_res = Tasks.reverseString("level");
            System.out.printf("Reversed string result: %s%n", task3_res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String task4_res = Tasks.removeDuplicatesFromString("aabvvvcc");
            System.out.printf("Removed duplicates from string result: %s%n", task4_res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer[] arr = {1, 2, 3};
            Integer[] task5_res = Tasks.reverseArray(arr);
            System.out.printf("Reversed array result: %s%n", Arrays.toString(task5_res));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int[][] twoDArray = {{1, 2}, {2, 3}};
            int task6_res = Tasks.twoDArraySum(twoDArray);
            System.out.printf("Two dimensional array sum result: %s%n", task6_res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}