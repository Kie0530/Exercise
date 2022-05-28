package Main.Java;
import java.util.*;

public class GamePractice {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");

        System.out.println("유저네임을 입력해주세요.");
        String username = scanner.nextLine();

        System.out.println("공격력을 입력해주세요.");
        String attack = scanner.nextLine();

        System.out.println("방어력을 입력해주세요.");
        String defence = scanner.nextLine();

        System.out.println("체력을 입력해주세요.");
        String hp = scanner.nextLine();

        System.out.println("생성된 유저 정보는 다음과 같습니다.");
        System.out.println("유저네임: " + username);
        System.out.println("공격력: " + attack);
        System.out.println("방어력: " + defence);
        System.out.println("체력: " + hp);

        System.out.println("대결상대 정보를 입력해주세요.");
        String username2 = scanner.nextLine();

        System.out.println("공격력을 입력해주세요.");
        String attack2 = scanner.nextLine();

        System.out.println("방어력을 입력해주세요.");
        String defence2 = scanner.nextLine();

        System.out.println("체력을 입력해주세요.");
        String hp2 = scanner.nextLine();

        System.out.println("대결상대 정보는 다음과 같습니다.");
        System.out.println("유저네임: " + username2);
        System.out.println("공격력: " + attack2);
        System.out.println("방어력: " + defence2);
        System.out.println("체력: " + hp2);

        System.out.println("대결을 시작합니다!");
        System.out.println("공격을 입력해주세요.");
        String attackGo = scanner.nextLine();
       // Integer attackGo1 = (int) attackGo;
      //  String hp3 = hp2 - hp3;
      //  System.out.println(username2 + "의 체력이 " + hp3 +"로 감소되었습니다.");



    }

}
