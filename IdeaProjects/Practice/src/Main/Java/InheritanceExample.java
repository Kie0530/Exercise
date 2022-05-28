package Main.Java;

public class InheritanceExample {
//    int a;
    int b;
}

class NoInheritance {
    int a;
    int b;
    int c;
} // InheritanceExample와 관계 없음. = 변경에 영향을 받지 않음.

class Inheritance extends InheritanceExample {
    int c;
} // InheritanceExample와 상속 관계. = 변경에 영향을 받음.
// 영향 ex. 부모 클래스에서 멤버를 삭제하면 자식 클래스의 멤버도 삭제됨.

class Inheritance2 {
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        inheritance.c = 10;
      //  inheritance.a = 10; // 부모 클래스의 멤버를 주석처리 했더니 상속을 받지 못해 사용 불가.
        inheritance.b = 10;
    }
}
