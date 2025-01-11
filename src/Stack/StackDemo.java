package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Add the element

        System.out.println(stack);


       Integer removedElement = stack.pop(); // Remove the element
        System.out.println(stack);
        Integer peek = stack.peek(); // top of the element  find
        System.out.println(peek);
        System.out.println(stack.isEmpty()); //  check  stack is empty or not return boolean value
        System.out.println(stack.size()); // size of the stack

        int search = stack.search(3);
        System.out.println(search);


    }
}
