import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        System.out.println(list);

        //1. iterator 进行遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }


        //2. foreach 也叫做 增强for
        for (String s : list) {
            System.out.println(s);
        }


        //3. lambda
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach(e -> {
            System.out.println(e);
        });
        list.forEach(e -> System.out.println(e));

        

    }
}
