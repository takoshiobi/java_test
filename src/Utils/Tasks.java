package Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;

public class Tasks {

    /*
    * Записать в переменную 10^100 и прибавить к ней 10^100 и вывести на экран
    * */
    public static BigInteger addition(){
        BigInteger a = new BigInteger("10").pow(100);
        BigInteger b = new BigInteger("10").pow(100);

        return a.add(b);
    }

    /*
    * Взять остаток от деления 8 на 3 и разделить на 2
    * */
    public static Integer division(){
        Integer a = 8;
        Integer b = 3;

        return a%b / 2;
    }

    /*
    * Развернуть строку (abc → cba)
    * */
    public static String reverseString(String string){
        if(string.isEmpty()){
          throw new IllegalArgumentException("String argument cannot be empty.");
        }

        return new StringBuilder(string).reverse().toString();
    }

    /*
    * Удалить все последовательные повторяющие символы (aabccd → abcd)
    * */
    public static String removeDuplicatesFromString(String string){
        if(string.isEmpty()){
            throw new IllegalArgumentException("String argument cannot be empty.");
        }

        StringBuilder sb = new StringBuilder();
        HashSet<Character> stringSet = new HashSet<>();
        char[] charArray = string.toCharArray();

        for(Character c: charArray){
            stringSet.add(c);
        }

        for(Character c: stringSet){
            sb.append(c);
        }

        return sb.toString();
    }

    /*
    * Развернуть массив ([0, 1, 2] → [2, 1, 0])
    * */
    public static ArrayList<Integer> reverseArray(int[] array){
        if(array.length == 0){
           throw new IllegalArgumentException("Array argument cannot be empty.");
        }

        ArrayList<Integer> reversedArray = new ArrayList<>();

        for(int i = array.length - 1; i >= 0; i--){
            reversedArray.add(array[i]);
        }

        return reversedArray;
    }

    /*
    * Сумма значений двумерного массива
    * */
    public static int twoDArraySum(int[][] twoDArray){
        int sum = 0;

        for(int[] array: twoDArray){
            for(int i: array) {
                sum += i;
            }
        }

        return sum;
    }
}
