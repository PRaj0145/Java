import java.util.Arrays;
import java.util.LinkedList;

public class Test {

public static void main(String[] args) {

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);

    linkedList.get(2);
    linkedList.addFirst(0);
    linkedList.addLast(5);
    linkedList.getFirst();
    linkedList.getLast();



    linkedList.remove(1);
    linkedList.removeIf(x -> x% 2 ==0);
    System.out.println(linkedList);

    LinkedList <String> Animals = new LinkedList<>(Arrays.asList("Cat","Dog","Tiger", "Lion", "Elephant"));
    LinkedList <String> animalsToremove = new LinkedList<>(Arrays.asList("Cat","Dog"));
    linkedList.removeAll(animalsToremove);

    System.out.println(animalsToremove);
    System.out.println(Animals);

}
}