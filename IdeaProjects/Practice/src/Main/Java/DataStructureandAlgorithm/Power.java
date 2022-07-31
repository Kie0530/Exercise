package Main.Java.DataStructureandAlgorithm;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,3)); // 27
        System.out.println(power(2,4)); // 16
    }
    public static long power(int base, int exponent) {
        if(exponent == 0) return 1;
        int half = exponent / 2;
        long temp = power(base, half);
        long res = (temp*temp) % 94906249;
        if(exponent%2==1) return base * res % 94906249;
        else	return res;
    }
}
