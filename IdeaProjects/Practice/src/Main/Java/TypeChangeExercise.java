package Main.Java;

public class TypeChangeExercise {
    public static void main(String[] args) {

        Car car = new Car();
        Wheel wheel = new Wheel();
        Wheel wheel2= null;

        wheel.run(); // 출력: 구르르
        car = wheel; // car = (Car)wheel; 에서 형변환 생략됨.
     //   car.run(); // Error. Car 타입의 참조변수인 car로 run() 사용불가.
        wheel2 = (Wheel)car; // 자손<-조상 타입. 형변환 생략 안 됨.
        wheel2.run(); // 출력: 구르르


    }
//}

//class Car {
    int x;
    String str;

    void start() {
        System.out.println("시동");
    }
    void stop() {
        System.out.println("정지");
    }
}
class Wheel extends Car {
    void run() {
        System.out.println("구르르");
    }
}