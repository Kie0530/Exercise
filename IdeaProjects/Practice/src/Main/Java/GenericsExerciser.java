package Main.Java;

public class GenericsExerciser {
    public static void main(String[] args) {

        GenericsExercise genericsExercise = new GenericsExercise();

        String str1 = genericsExercise.<String>accept("Kim coding");
        String str2 = genericsExercise.accept("Kim coding");
        System.out.println(str1);
        System.out.println(str2);

        genericsExercise.<String, Integer>getPrint("Kim Coding", 1);
        genericsExercise.getPrint("Kim Coding", 2);
    }
}
