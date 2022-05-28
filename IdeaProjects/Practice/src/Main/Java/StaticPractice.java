package Main.Java;

public class StaticPractice {
    public static void main(String[] args) {
     //   System.out.println(Car.InstanceVariable);
      //  System.out.println(Car.InstanceMethod());
        System.out.println(Car.ClassVariable);
      //  System.out.println(Car.ClassMethod());

        Car car1 = new Car();
        Car car2 = new Car();

        car1.ClassVariable = "ddd";
        System.out.println(car1.ClassVariable);
        System.out.println(car2.ClassVariable);
        System.out.println(Car.ClassVariable);

        car1.InstanceVariable = "ddd";
        System.out.println(car1.InstanceVariable);
        System.out.println(car2.InstanceVariable);
     //   System.out.println(Car.InstanceVariable);

    }
}
class Car {
    public String InstanceVariable = "나는 인스턴스 변수";
    public static String ClassVariable = "나는 클래스 변수";

    public static void ClassMethod () {
   //     System.out.println(InstanceVariable);
        System.out.println(ClassVariable);
    }

    public void InstanceMethod() {
        System.out.println(InstanceVariable);
        System.out.println(ClassVariable);
    }
}
