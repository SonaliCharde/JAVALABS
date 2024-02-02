package CollectionsFramework;

import java.util.Stack;

public class Lab188 {
    public static void main(String[] args) {
        //Stack
        Stack<String> stack = new Stack<>();
        stack.push("Sonali");
        stack.push("Tushar");
        stack.push("Charde");
        //stack.pop(123);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("Charde");
        stack.peek();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
