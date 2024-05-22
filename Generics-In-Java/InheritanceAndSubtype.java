import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class InheritanceAndSubtype {
    public static void main(String[] args) {
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // what will happen ?

        SimpleGeneric<Number> simpleGeneric = new SimpleGeneric<>(null);
        simpleGeneric.setObj(new Integer(10));
        System.out.println(simpleGeneric.getObj()); // what will happen ?

        SimpleGeneric<Integer> simpleGeneric2 = new SimpleGeneric<>(10);
        test(simpleGeneric);
//        test(simpleGeneric2); // what will happen ?

        // https://docs.oracle.com/javase/tutorial/java/generics/inheritance.html

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        test2(ints); // what will happen ?


        SimpleGeneric<Integer> simpleGeneric3 = new SimpleGeneric<>(10);
//        test3(simpleGeneric3); // what will happen ?
        test4(simpleGeneric3); // what will happen ?

        ArrayList<Integer> ints2 = new ArrayList<>();
        ints2.add(1);
        test5(ints2); // what will happen ?


        ArrayList<? extends Number> nums = new ArrayList<>();
        ArrayList<Number> nums2 = new ArrayList<>();
        ArrayList<Integer> ints3 = new ArrayList<>();
        nums = ints3; // what will happen ?
//        nums2 = ints3; // what will happen ?
        // https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html

    }

    public static void test(SimpleGeneric<Number> n) { /* ... */ }

    public static void test2(List<Integer> n) { /* ... */ }

    public static void test3(SimpleGeneric<Object> n) { /* ... */ }

    public static void test4(SimpleGeneric<?> n) { /* ... */ }

    public static void test5(List<? extends Number> n) { /* ... */ }

}
