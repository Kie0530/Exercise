package Main.Java;

interface Eyes {public abstract void blink();}
interface Mouth {public abstract void talk();}

class Face implements Eyes, Mouth {
    public void blink() {
        System.out.println("눈을 깜빡");
    }
    public void talk() {
        System.out.println("말말말");
    }
}
class Human implements Eyes, Mouth {
    public void blink() {
        System.out.println("사람은 눈을 깜빡");
    }
    public void talk() {
        System.out.println("사람을 말말말");
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        Face face = new Face();
        Human human = new Human();
        face.blink();
        face.talk();
        human.blink();
        human.talk();
    }

}
// 출력:
// 눈을 깜빡
// 말말말
// 사람은 눈을 깜빡
// 사람을 말말말

