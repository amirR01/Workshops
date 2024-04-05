public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    public static void Error1(){
        int num1 = "5";
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    public static void Error2(){
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
    public static void Error3(){
        int num1 = 5;
        String num2 = "10";
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    public static void Error4(){
        final int num1 = 5;
        num1 = 10;
    }
    public static void Error5(){
        int num1 = 5/0;
    }
    public static void Error6(){
        int num1 = 0;
        int num2 = 10 / num1;
    }
    public static void Error7(){
        Error7();
    }
    public static void Error8(){
        String num1 = null;
        System.out.println(num1.length());
    }
}



// bytecode:
// 0: iconst_5
// 1: istore_1
// 2: bipush        10
// 4: istore_2
// 5: iload_1
// 6: iload_2
// 7: iadd
// 8: istore_3
// 9: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
// 12: new           #3                  // class java/lang/StringBuilder
// 15: dup
// 16: ldc           #4                  // String The sum is:
// 18: invokespecial #5                  // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
// 21: iload_3
// 22: invokevirtual #6                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
// 25: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
// 28: invokevirtual #8                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
// 34: return