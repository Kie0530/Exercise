package Main.Java.DataStructureandAlgorithm;
import java.util.*;

public class ConvertDoubleSpaceToSingle {
    public String convertDoubleSpaceToSingle(String str) {
        String result = "";
        result = str.replaceAll("  ", " ");
        return result;
    }
}


