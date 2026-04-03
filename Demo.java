import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        System.out.println(list); // [5, 10, 20]

        list.removeFirst();
        System.out.println(list); // [10, 20]

        System.out.println(list.getFirst()); // 10
    }
}
