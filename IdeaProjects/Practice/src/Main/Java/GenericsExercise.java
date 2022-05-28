package Main.Java;

public class GenericsExercise {
    public <T> T accept(T t){
        return t;
    }
    public <K, V> void getPrint(K k, V v) {
        System.out.println(k + ":" + v);
    }
}
