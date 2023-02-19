import java.util.Scanner;

public class Tester {
    public static void main (String[] args){

        StackOfItegers stack = new StackOfItegers(10);
        stack.push(12);
        stack.push(15);
        stack.push(332);
        stack.push(131);
        stack.push(45);
        System.out.println("Stack after adding elements.");
        stack.printStack();
        stack.pop();
        System.out.println("Stack after pooping the top element");
        stack.printStack();


    }
}
