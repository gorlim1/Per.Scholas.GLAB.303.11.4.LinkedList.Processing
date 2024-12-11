import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");


        System.out.println("Linked List Content: " + linkedList);

        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("Linked List Content after addition: " + linkedList);


//        Object firstVar = linkedList.getFirst();
        Object firstVar = linkedList.get(0);
        System.out.println("First element: " + firstVar);

        linkedList.set(0, "Changed first Item");
        Object firstVar2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + firstVar2);


        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);


        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println("Final Content: " + linkedList);
    }
}