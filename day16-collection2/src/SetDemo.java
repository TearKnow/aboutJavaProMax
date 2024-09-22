import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //不重复
        //HashSet LinkedHashSet TreeSet
//        Set<String> sets = new HashSet<>();
        Set<String> sets = new TreeSet<>();
        sets.add("Mysql");
        sets.add("Java");
        sets.add("Java");
        sets.add("Html");
        System.out.println(sets);


        String a = "wo shi abc";
        System.out.println(a.hashCode());
    }
}