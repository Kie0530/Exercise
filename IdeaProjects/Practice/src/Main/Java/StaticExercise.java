package Main.Java;

public class StaticExercise {
    public static void main(String[] args) {
        StaticNumbers staticNumbers = new StaticNumbers();
        System.out.println(staticNumbers.num1); // 100
        System.out.println(StaticNumbers.num2); // 200

        staticNumbers.num1 = 500;
        staticNumbers.num2 = 600;
        System.out.println(staticNumbers.num1); // 500
        System.out.println(staticNumbers.num2); // 600

       // StaticNumbers.num1 = 300; // 에러 java: Cannot make a static reference to the non-static field
        StaticNumbers.num2 = 400;
      //  System.out.println(StaticNumbers.num1);
        System.out.println(StaticNumbers.num2); // 400
        System.out.println(staticNumbers.num2); // 400
    }
}

class StaticNumbers {
    int num1 = 100;
    static int num2 = 200;
}
