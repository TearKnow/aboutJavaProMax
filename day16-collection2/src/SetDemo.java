import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //不重复
        //HashSet LinkedhashSet TreeSet
        Set<String> sets = new HashSet<>();
        sets.add("Mysql");
        sets.add("Java");
        sets.add("Java");
        sets.add("Html");
        System.out.println(sets);


    }
}