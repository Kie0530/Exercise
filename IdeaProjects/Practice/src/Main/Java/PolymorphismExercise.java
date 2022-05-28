package Main.Java;

public class PolymorphismExercise {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new Latte());
        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}
class Customer { //
    int money = 50000;

    void buyCoffee(Coffee coffee) { // 매개변수의 다형성, 상위 클래스 타입의 참조변수로 하위 클래스의 객체 참조. Coffee의 모든 인스턴스들을 참조할 수 있게 해준다. (이게 아니면 커피 메뉴마다 메서드 만들어야 됨)
        if(money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}

class Coffee { // 가격 초기화 역할
    int price;
    public Coffee(int price) {
        this.price = price;
    }
}
class Americano extends Coffee {
    public Americano () { // 아메리카노 가격 설정 역할
        super(4000);
    }
    public String toString() {return "아메리카노";}; // 오브젝트 클래스의 toString메서드를 오버라이딩해서 아메리카노라는 스트링 반환
}
class Latte extends Coffee {
    public Latte () {
        super(4500);
    }
    public String toString() {return "라떼";};
}
