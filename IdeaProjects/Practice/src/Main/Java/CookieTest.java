package Main.Java;

public class CookieTest {
    public static void main(String[] args) {
        Cookie c = new Cookie("남아", 5, "푸들"); // 객체 생성.

        System.out.println("쿠키는 " + c.gender + ", 나이는 " + c.age + "살이고, 종은 " + c.kind + "입니다.");
        // 필드 호출
        System.out.println("쿠키는 배고플 때 ");
        c.eat(); // 메서드 호출
        System.out.println("쿠키는 긴장할 때 ");
        c.bark(); // 메서드 호출
        System.out.println("쿠키는 졸릴 때 ");
        c.sleep(); // 메서드 호출

    }

}