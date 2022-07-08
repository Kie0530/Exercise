package Main.Java.DataStructureandAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1271 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer tk = new StringTokenizer(str, " ");
        int money = Integer.parseInt(tk.nextToken());
        int people = Integer.parseInt(tk.nextToken());

        System.out.println(money/people);
        System.out.println(money%people);
    }
    //test 1
    //100 5
    //20
    //0

    //test 2
    //99999 9
    //11111
    //0
}
