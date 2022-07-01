package Main.Java.DataStructureandAlgorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] baseTest = new int[]{1, 2, 3, 4};
        int[] sampleTest = new int[]{2, 4};
        System.out.println(isSubsetOf(baseTest, sampleTest)); //true
        System.out.println(isSubsetOf2(baseTest, sampleTest)); //true

    }
    // Solution 1
    private static boolean isSubsetOf(int[] base, int[] sample) {
        int count = 0;

        if(base.length==0||sample.length==0) return false;

        for(int i = 0; i < sample.length; i++) {
            for(int j = 0; j < base.length; j++) {
                if(sample[i]==base[j]) {
                    count++;
                } else {
                    continue;
                }
            } if(count == sample.length) return true;
        } return false;

    }
    // Solution 2
    private static boolean isSubsetOf2(int[] base, int[] sample) {

        List<Integer> baseCompare = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for(int i : sample) {
            if(!baseCompare.contains(i))
                return false;
        } return true;

    }
}


