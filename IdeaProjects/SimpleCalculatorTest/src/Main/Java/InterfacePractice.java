package Main.Java;

public class InterfacePractice {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student studentA = new StudentA();
        Student studentB = new StudentB();

        teacher.giveHomeWork(studentA);
        teacher.giveHomeWork(studentB);

    }
}
// 출력:
// Assignment of the day : two pages of essay
//Assignment of the day : ten math questions