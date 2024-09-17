import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionDemo {
    public static void main(String[] args) {
        //ArrayList
        Collection<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        System.out.println(list);

        //HashSet: 无序 不重复
        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add(23);
        list1.add(false);
        list1.add("java");
        list1.add("java");
        System.out.println(list1);


    }
}