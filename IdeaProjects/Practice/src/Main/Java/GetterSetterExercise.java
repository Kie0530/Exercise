package Main.Java;

public class GetterSetterExercise {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setName("김자바");
        s.setAge(20);
        s.setGrade(6);

        String name = s.getName();
        int age = s.getAge();
        int grade = s.getGrade();
        System.out.println("학생 이름은 " + name + ", 나이는 " + age + "살, 학년은 " + grade + "학년입니다. ");
    }
}

class Student2 {
    private String name;
    private int age;
    private int grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade (int grade) {
        this.grade = grade;
    }

}
