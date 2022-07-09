package Main.Java.DataStructureandAlgorithm;
import java.util.*;
public class TilingAlgorithm {

    public int tiling(int num) {
        // naive solution:
        //int count = 0;
        //if(num<=2) return count;
        //return tiling(num-2) + tiling(num-1);

        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(0,1,2));
        return rec(num, temp);

    }
    public int rec(int size, ArrayList<Integer> temp) {
        if(temp.size()>size) return temp.get(size);
        temp.add(rec(size-1,temp)+rec(size-2,temp));
        return temp.get(size);
    }
}

