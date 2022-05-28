package Main.Java;

public class Overloading {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer2 = new Computer("This is Constructor");

    }
}

class Computer {
        Computer () {
            System.out.println("1번 생성자"); // 1번 생성자
        }
        Computer(String string) {
            this();
            System.out.println("2번 생성자"); //1번 생성자 2번 생성자
        }

}
