package Utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPITasks {
    public static Long arrayLength(List<Integer> intArray) {
        return intArray.stream().count();
    }

    public static List<Integer> firstTen(List<Integer> intArray) {
        return intArray.stream().sorted().limit(10).collect(Collectors.toList());
    }

    public static List<Integer> lastTen(List<Integer> intArray) {
        return intArray.stream().sorted().skip((long) intArray.size() - 10).collect(Collectors.toList());
    }

    public static List<Integer> multiplyTen(List<Integer> intArray) {
        return intArray.stream().map(el -> el * 10).collect(Collectors.toList());
    }

    public static List<Integer> oddAddTwo(List<Integer> intArray) {
        return intArray.stream().map(el -> el % 2 == 0 ? el : el + 2).collect(Collectors.toList());
    }

    public static Integer arraySum(List<Integer> intArray) {
        return intArray.stream().reduce(0, Integer::sum);
    }

    public static Boolean containsIntGreaterThan100(List<Integer> intArray) {
        return intArray.stream().anyMatch(el -> el > 100);
    }

    public static Map<Integer, Integer> convertToMap(List<Integer> intArray) {
        return intArray.stream().distinct().collect(Collectors.toMap(el -> el, el -> el));
    }
}