import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Set<String> names2 = new LinkedHashSet<>();
        Set<String> names3 = new TreeSet<>();
        setItems(names);
        setItems(names2);
        setItems(names3);
        System.out.println("HashSet");
        print(names);
        System.out.println("LinkedHashSet");
        print(names2);
        System.out.println("TreeSet");
        print(names3);
    }

    private static void setItems(Set<String>names){
        names.add("Kazys");
        names.add("Audrius");
        names.add("Dainius");
        names.add("Nezinau");
        names.add("Dainius");
    }

    private static void print(Set<String> setas){
        setas.forEach(a-> System.out.println(a));
    }
}
