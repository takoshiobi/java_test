package utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPITasks {

    /*
     * Вывести изначальный список элементов
     */
    public static void printList(List<Integer> intList){
        System.out.printf("List of elements: %s%n", intList);
    }

    /*
     * Вывести количество элементов в списке
     */
    public static Long listLength(List<Integer> intList) {
        return intList.stream().count();
    }

    /*
     * Отсортировать и отобрать первые 10 элементов
     */
    public static List<Integer> firstTenElemsOfSortedList(List<Integer> intList) {
        return intList.stream().sorted().limit(10).collect(Collectors.toList());
    }

    /*
     * Отсортировать и отобрать последние 10 элементов (skip)
     */
    public static List<Integer> lastTenElemsOfSortedList(List<Integer> intList) {
        return intList.stream().sorted().skip(intList.size() - 10L).collect(Collectors.toList());
    }

    /*
     * Умножить все элементы на 10
     */
    public static List<Integer> multiplyListElemsByTen(List<Integer> intList) {
        return intList.stream().map(el -> el * 10).collect(Collectors.toList());
    }

    /*
     * Четные элементы оставить без изменений, а к нечетным прибавить 2
     */
    public static List<Integer> addTwoToOddNumbers(List<Integer> intList) {
        return intList.stream().map(el -> el % 2 == 0 ? el : el + 2).collect(Collectors.toList());
    }

    /*
     * Вычислить сумму всех элементов (reduce)
     */
    public static Integer sumOfListElems(List<Integer> intList) {
        return intList.stream().reduce(0, Integer::sum);
    }

    /*
     * Вывести true если хотя бы один элемент больше 100 (anyMatch)
     */
    public static Boolean containsIntGreaterThan100(List<Integer> intList) {
        return intList.stream().anyMatch(el -> el > 100);
    }

    /*
     * Преобразовать список в Map (ключ и значение = элемент списка)
     */
    public static Map<Integer, Integer> convertToMap(List<Integer> intList) {
        return intList.stream().distinct().collect(Collectors.toMap(el -> el, el -> el));
    }
}