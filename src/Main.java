import Utils.Tasks;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BigInteger task1_res = Tasks.addition();
        System.out.println("Addition of big integers result: " + task1_res);

        Integer task2_res = Tasks.division();
        System.out.println("Division result: " + task2_res);

        try {
            String task3_res = Tasks.reverseString("merci");
            System.out.println("Reversed string result: " + task3_res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String task4_res = Tasks.removeDuplicatesFromString("aabvvvcc");
            System.out.println("Removed duplicates from string result: " + task4_res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int[] arr = {1,2,3};
            ArrayList<Integer> task5_res = Tasks.reverseArray(arr);
            System.out.println("Reversed array result: " + task5_res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[][] twoDArray = {{1,2}, {2,3}};
        int task6_res = Tasks.twoDArraySum(twoDArray);
        System.out.println("Two dimensional array sum result: " + task6_res);

    }
}