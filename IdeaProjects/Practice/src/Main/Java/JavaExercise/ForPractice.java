package Main.Java.JavaExercise;

public class ForPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == j) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    }
}
//[0, 0]
//     [1, 1]
//          [2, 2]
//               [3, 3]
//                    [4, 4]
//                         [5, 5]
