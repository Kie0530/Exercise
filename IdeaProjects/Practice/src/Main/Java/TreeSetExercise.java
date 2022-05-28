package Main.Java;
import java.util.TreeSet;

public class TreeSetExercise {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();

        workers.add("Jo ahin");
        workers.add("Kim wonyoung");
        workers.add("Lee june");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Jo"));
        System.out.println(workers.subSet("Kim", "Lee"));
}}
