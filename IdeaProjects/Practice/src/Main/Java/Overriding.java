package Main.Java;

public class Overriding {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer3 computer3 = new Computer3();
        TV tv = new TV();

        phone.on(); // Phone is on.
        computer3.on(); // Computer3 is on.
        tv.on(); // TV is on.

        UpperComputer phone2 = new Phone();
        UpperComputer computer34 = new Computer3();
        UpperComputer tv2 = new TV();

        phone2.on(); // Phone is on.
        computer34.on(); // Computer3 is on.
        tv2.on(); // TV is on.

        UpperComputer[] upperComputers = new UpperComputer[] {new Phone(), new Computer3(), new TV()};
        for (UpperComputer upperComputer : upperComputers) {
            upperComputer.on();
        } // Phone is on. Computer3 is on. TV is on.

    }
}

class UpperComputer {
    void on() {
        System.out.println("Uppercomputer is on.");
    }
}
class Phone extends UpperComputer {
    void on() {
        System.out.println("Phone is on.");
    }
}
class Computer3 extends UpperComputer {
    void on() {
        System.out.println("Computer3 is on.");
    }
}
class TV extends UpperComputer {
    void on() {
        System.out.println("TV is on.");
    }
}