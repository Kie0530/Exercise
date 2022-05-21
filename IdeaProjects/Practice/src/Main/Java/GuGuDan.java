package Main.Java;

public class GuGuDan {
    public static void dan (int n){
        for(int i=1;i<10;i++) {
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        GuGuDan gugu = new GuGuDan();

        for(int i=1;i<10;i++){
            gugu.dan(i);
        }
    }


}


