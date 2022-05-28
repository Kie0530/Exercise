package Main.Java;

public class PolymorphismExercise2 {
    public static void main(String[] args) {

    Customer2 customer2 = new Customer2();
    customer2.buySupplies(new Pen());
    customer2.buySupplies(new Paper());
    customer2.buySupplies(new Eraser());

        System.out.println("현재 잔액은 " + customer2.money + "원 입니다.");

}
}

class Customer2 {
    int money = 10000;

    void buySupplies (Supplies supplies) {
        if(supplies.price > money) {
            System.out.println("잔액이 부족합니다.");
        }
        money = money - supplies.price;
        System.out.println(supplies + "를 구입했습니다."); //왜 여기에 작성? 물건을 구매한 후 잔액 계산 식 인데
    }
}
class Supplies {
    int price;
    public Supplies(int price) {
        this.price = price;
    //public Supplies(Supplies supplies) {
    //    System.out.println(supplies + "를 구입했습니다.");
    }

}
class Pen extends Supplies {
    public Pen() {
        super(1000);
    }
    public String toString()
    {return "펜";};
}
class Paper extends Supplies {
    public Paper() {
        super(3000);
    }
    public String toString()
    {return "종이";};
}
class Eraser extends Supplies {
    public Eraser() {
        super(500);
    }

    public String toString()
    {return "지우개";};
}
// 출력:
// 펜를 구입했습니다.
// 종이를 구입했습니다.
// 지우개를 구입했습니다.
// 현재 잔액은 5500원 입니다.