package Main.Java.Java기초;
import java.util.*;

public class RockScissorPaperPractice {
    public static void main(String[] args) {

        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입혁하세요.");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int computer = (int)(Math.random() * 3 + 1);

        System.out.println("당신은 " + user + "를 냈습니다.");
        System.out.println("컴퓨터는 " + computer + "를 냈습니다.");

        switch(user - computer) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case -2: case 1:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("무승부입니다.");
                break;
        }
    }
}
