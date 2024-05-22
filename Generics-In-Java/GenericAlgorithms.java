import java.util.*;
public class GenericAlgorithms {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, -4, 1, -5, 9, -2, 6, 5));
        List<Integer> sortedList = absoluteSort(list);
        System.out.println(sortedList);

        List<Double> list2 = new ArrayList<>(Arrays.asList(3.0, 1.0, -4.0, 1.0, -5.0, 9.0, -2.0, 6.0, 5.0));
        List<Double> sortedList2 = absoluteSort(list2);
        System.out.println(sortedList2);

        List<Long> list3 = new ArrayList<>(Arrays.asList(3L, 1L, -4L, 1L, -5L, 9L, -2L, 6L, 5L));
        List<Long> sortedList3 = GenericAlgorithms.<Long>absoluteSort(list3);
        System.out.println(sortedList3);

        List<Short> list4 = new ArrayList<>(Arrays.asList((short)3, (short)1, (short)-4, (short)1, (short)-5, (short)9, (short)-2, (short)6, (short)5));
        List<Short> sortedList4 = GenericAlgorithms.<Short>absoluteSort(list4);
        System.out.println(sortedList4);

        List<Float> list5 = new ArrayList<>(Arrays.asList(3.3434f, 1.234f, -12.34f, 1.34f, -5.34f, 9.34f, -2.34f, 6.34f, 5.34f));
        List<Float> sortedList5 = GenericAlgorithms.<Float>absoluteSort(list5);
        System.out.println(sortedList5);
    }


    // which function signature is better to use?

    public static <T extends Comparable<T>> List<T> NotInPlaceSort(List<T> list) {
        List<T> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> a.compareTo(b)); // just to show that we are sorting the list
        return sortedList;
    }
    public static List<? extends Comparable<?>> NotInPlaceSort2(List<? extends Comparable<?>> list) {
        return null;
    }
    public static <T extends Number> List<T> absoluteSort(List<T> list) {
        // Create a comparator that compares the absolute values of the elements
        Comparator<T> absComparator = Comparator.comparingDouble(num -> Math.abs(num.doubleValue()));

        // Create a copy of the list to sort
        List<T> sortedList = new ArrayList<>(list);

        // Sort the list using the comparator
        sortedList.sort(absComparator);

        return sortedList;
    }
}
