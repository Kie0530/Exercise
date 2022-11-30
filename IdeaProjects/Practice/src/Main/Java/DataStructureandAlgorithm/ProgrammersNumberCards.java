package Main.Java.DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersNumberCards {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10,17};
        int[] arrayB = new int[]{5,20};
        System.out.println(solution(arrayA, arrayB)); // ans = 0

        int[] arrayC = new int[]{10,20};
        int[] arrayD = new int[]{5,17};
        System.out.println(solution(arrayC, arrayD)); // ans = 10

        int[] arrayE = new int[]{14,35,119};
        int[] arrayF = new int[]{18,30,102};
        System.out.println(solution(arrayE, arrayF)); // ans = 18
    }

    public static int solution(int[] arrayA, int[] arrayB) {
        List<Integer> divisorsA = getDivisors(arrayA);
        List<Integer> divisorsB = getDivisors(arrayB);
        int a = getNonDivisor(arrayB, divisorsA);
        int b = getNonDivisor(arrayA, divisorsB);
        return Math.max(a, b);
    }

    public static int getNonDivisor(int[] array, List<Integer> divisors) {
        int nonDivisor = 0;
        for (int divisor : divisors) {
            boolean isNonDivisor = true;
            for (int a : array) {
                if (a % divisor == 0) {
                    isNonDivisor = false;
                    break;
                }
            }
            if (isNonDivisor) {
                nonDivisor = Math.max(nonDivisor, divisor);
            }
        }
        return nonDivisor;
    }

    public static List<Integer> getDivisors(int[] array) {
        List<Integer> list = new ArrayList<>();
        int min = array[0];
        for (int i = 2; i <= min; i++) {
            boolean isDivisor = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % i != 0) {
                    isDivisor = false;
                    break;
                }
                if (isDivisor) {
                    list.add(i);
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
        return list;
        }
    }


