package Main.Java.DataStructureandAlgorithm;
import java.util.*;
import java.util.stream.Collectors;

public class RotatedArraySearch {

    public static void main(String[] args) {
        int[] test = new int[]{4, 5, 0, 1, 2, 3};
        int targetTest = 3;
        System.out.println(rotatedArraySearch(test,targetTest)); // 5
    }

    private static int rotatedArraySearch(int[] rotated, int target) {
        List<Integer> list = Arrays.stream(rotated).boxed().collect(Collectors.toList());
        if(list.contains(target)) return list.indexOf(target);
        else return -1;

    }
}
