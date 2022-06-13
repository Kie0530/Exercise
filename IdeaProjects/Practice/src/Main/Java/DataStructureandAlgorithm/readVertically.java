package Main.Java.DataStructureandAlgorithm;

public class readVertically {
    public static void main(String[] args) {

        String[] arr= new String[]{"YCDt","oao", "unI"};

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].length()){
                max = arr[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < max; j ++) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].length() <= j) continue;
                sb.append(arr[i].charAt(j));
            }
        }


        System.out.println(sb.toString());

    }
}
