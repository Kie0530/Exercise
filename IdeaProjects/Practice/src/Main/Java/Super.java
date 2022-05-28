package Main.Java;

public class Super {
    public static void main(String[] args) {
        Second s = new Second();
    }
}
class First {
    First() {
        System.out.println("First 생성자");
    }
}
class Second extends First {
    Second() {
        super();
        System.out.println("Second 생성자");
    }
}
// 출력: First 생성자
//      Second 생성자