package Main.Java;
enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE}

public class EnumPractice {
    public static void main(String[] args) {

        Rainbow r1 = Rainbow.RED;
        Rainbow r2 = Rainbow.ORANGE;
        Rainbow r3 = Enum.valueOf(Rainbow.class, "RED");

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("r1 = r2 ? " + (r1 == r2));
        System.out.println("r1 = r3 ? " + (r1 == r3));
        System.out.println("r1.equals(r3) ? " + (r1.equals(r3)));

        switch(r1){
            case RED:
                System.out.println("The color is RED.");
                break;
            case ORANGE:
                System.out.println("The color is ORANGE.");
                break;
            case YELLOW:
                System.out.println("The color is YELLOW.");
                break;
            default:
                System.out.println("Invalid color.");
        }

        Rainbow[] rainbowArr = Rainbow.values();

        for(Rainbow r : rainbowArr)
            System.out.printf("%s=%d%n", r.name(), r.ordinal());


    }
}
// 출력:
//r1 = RED
//r2 = ORANGE
//r3 = RED
//r1 = r2 ? false
//r1 = r3 ? true
//r1.equals(r3) ? true
//The color is RED.
//RED=0
//ORANGE=1
//YELLOW=2
//GREEN=3
//BLUE=4
//NAVY=5
//PURPLE=6