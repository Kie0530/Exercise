package Main.Java;

public class Cookie {

    String gender; // 필드 선언
    int age;
    String kind;

    Cookie () {};

    Cookie(String gender, int age, String kind){
        this.gender = gender;
        this.age = age;
        this.kind = kind;
    }

    public void eat() { // 메서드 선언
        System.out.println("밥을 먹는다.");
    }
    void bark() {

        System.out.println("짖는다.");
    }
    void sleep() {

        System.out.println("쿨쿨 잔다.");
    }


}


