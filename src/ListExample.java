import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {
        ArrayList<Integer> simpleArray = new ArrayList<>();
        List<String> names = new LinkedList<>();

        simpleArray.add(12);
        simpleArray.add(1);
        names.add("Juozas");
        names.add("Andrius");
        names.add(1, "Kazys");

        print(names);
        print(simpleArray);
    }

    private static <E> void print(List<E> list){
        System.out.println("Saraso ilgis " + list.size() );
        list.forEach(a-> System.out.println(a));
    }
}
