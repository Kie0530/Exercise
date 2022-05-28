package Main.Java;
import java.util.*;
// 현재 코드 문제점:
// 한 가지 메뉴 이용을 마치면 프로그램이 꺼진다. -> switch문이 아닌 걸 쓰면 되나?
// 재고 조회를 할줄 모름. -> 다른 종료된 case의 변수를 갖고 와서 어떻게 재고를 파악하는지. 배열을 써야 하나..
// main메서드에 이렇게 내용이 많아도 되나? 원래 의도는 메소드를 각각 선언하는 것..
// 너무 기초적이다 코드가..

public class BookShopAladinPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[시스템] 이용하실 메뉴를 선택해주세요.");
        BookShopAladinPractice.showMenu();
        String num = scanner.nextLine();

        switch(num){
            case "1" :
        System.out.println("등록할 책 제목을 입력해주세요.");
        String bookName = scanner.nextLine();
        System.out.println("<" + bookName + "> 도서가 등록 되었습니다.");
            break;

            case "2" :
                System.out.println("입고할 책 제목을 입력해주세요.");
                String bookAdd = scanner.nextLine();
                System.out.println("입고할 책 수량을 입력해주세요.");
                String bookAddAmount = scanner.nextLine();
                System.out.println("<" + bookAdd + "> 도서를 " + bookAddAmount + "권 입고 완료했습니다.");
                break;

            case "3" :
                System.out.println("출고할 책 제목을 입력해주세요.");
                String bookDecrease = scanner.nextLine();
                System.out.println("출고할 책 수량을 입력해주세요.");
                String bookDecreaseAmount = scanner.nextLine();
                System.out.println("<" + bookDecrease + "> 도서를 " + bookDecreaseAmount + "권 출고 완료했습니다.");
                break;

            case "4" :
                System.out.println("재고를 조회합니다.");
                System.out.println("<  도서가 " );
                break;

            case "5" :
                System.out.println("프로그램을 종료합니다.");
                break;

        }


    }

    public static void showMenu(){
        System.out.println("[1] 중고책 등록");
        System.out.println("[2] 중고책 입고");
        System.out.println("[3] 중고책 출고");
        System.out.println("[4] 중고책 재고 조회");
        System.out.println("[5] 프로그램 종료");
    }

}
