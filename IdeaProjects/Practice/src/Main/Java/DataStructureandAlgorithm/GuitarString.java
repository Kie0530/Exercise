package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class GuitarString {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int BrokenString = scanner.nextInt();
        int BrandNum = scanner.nextInt();

        int[] packagePrice = new int[BrandNum];
        int[] unitPrice = new int[BrandNum];

        for(int i = 0; i<BrandNum; i++) {
            packagePrice[i] = scanner.nextInt();
            unitPrice[i] = scanner.nextInt();
        }

        Arrays.sort(packagePrice);
        Arrays.sort(unitPrice);

        int res = 0;
        res = Math.min(((BrokenString/6)+1)*packagePrice[0], BrokenString*unitPrice[0]);
        res = Math.min(res, (BrokenString%6)*unitPrice[0] + (BrokenString/6)*packagePrice[0]);

        System.out.println(res);

    }
}
