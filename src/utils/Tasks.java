package utils;

import java.math.BigInteger;
import java.util.HashSet;

public class Tasks {

    /*
     * Записать в переменную 10^100 и прибавить к ней 10^100 и вывести на экран
     * */
    public static BigInteger addition() {
        BigInteger a = BigInteger.valueOf(10L).pow(100);

        return a.add(a);
    }

    /*
     * Взять остаток от деления 8 на 3 и разделить на 2
     * */
    public static Integer division() {
        Integer a = 8;
        Integer b = 3;

        return a % b / 2;
    }

    /*
     * Развернуть строку (abc → cba)
     * */
    public static String reverseString(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("String argument cannot be null or empty.");
        }

        return new StringBuilder(string).reverse().toString();
    }

    /*
     * Удалить все последовательные повторяющие символы (aabccd → abcd)
     * */
    public static String removeDuplicatesFromString(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("String argument cannot be null or empty.");
        }

        StringBuilder sb = new StringBuilder();
        HashSet<Character> stringSet = new HashSet<>();
        char[] charArray = string.toCharArray();

        for (Character c : charArray) {
            stringSet.add(c);
        }

        for (Character c : stringSet) {
            sb.append(c);
        }

        return sb.toString();
    }

    /*
     * Развернуть массив ([0, 1, 2] → [2, 1, 0])
     * */
    public static Integer[] reverseArray(Integer[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array argument cannot be null or empty.");
        }

        Integer[] reversedArray = new Integer[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[reversedArray.length - i - 1] = array[i];
        }

        return reversedArray;
    }

    /*
     * Сумма значений двумерного массива
     * */
    public static int twoDArraySum(int[][] twoDArray) {
        if (twoDArray == null) {
            throw new IllegalArgumentException("twoDArray argument cannot be null.");
        }

        int sum = 0;

        for (int[] array : twoDArray) {
            for (int i : array) {
                sum += i;
            }
        }

        return sum;
    }
}
