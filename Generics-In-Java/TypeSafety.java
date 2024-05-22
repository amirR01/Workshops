public class TypeSafety {
    public static void main(String[] args) {
        ObjectHolder objHolder = new ObjectHolder("Hello", String.class);
        String str = (String) objHolder.getObj();
        System.out.println(str); // what will happen ?

        ObjectHolder objHolder2 = new ObjectHolder(10, Integer.class);
        String i = (String) objHolder2.getObj();
        System.out.println(i); // what will happen ?

        objHolder.setObj(objHolder2.getObj());
        System.out.println(objHolder.getObj().getClass());
        System.out.println(objHolder.getType());  // what will happen ?

        // what if we use the following code instead of the above code
        SimpleGeneric<String> simpleGeneric = new SimpleGeneric<>("Hello");
        String str2 = simpleGeneric.getObj();
        System.out.println(str2); // what will happen ?

        SimpleGeneric<Integer> simpleGeneric2 = new SimpleGeneric<>(10);
//        String i2 = simpleGeneric2.getObj();
//        System.out.println(i2); // what will happen ?

//        simpleGeneric.setObj(simpleGeneric2.getObj());
        System.out.println(simpleGeneric.getObj()); // what will happen ?
    }
}