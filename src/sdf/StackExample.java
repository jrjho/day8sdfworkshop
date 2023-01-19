package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public void example(){
        Stack<Integer> stack = new Stack<Integer>();

        for (int i =0; i<10; i++)
            stack.push(i);

        stack.pop();
        stack.push(100);
        stack.push(982);
        stack.push(9);
        stack.pop();

        for (int i =0; i<4; i++){
            Integer stackItem = stack.pop();
            System.out.println(stackItem);
        }
        Integer item = stack.peek();
        System.out.println("Peek: " + item);

        Integer firstItem = stack.firstElement();
        System.out.println("First item: " + firstItem);

        Integer idx = stack.search(2);
        System.out.println("Item at index: " + idx);

        //prints from bottom
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()){
            Integer stackIt = its.next();
            System.out.println("Elements of stack: " + stackIt);


        }


    }

    
}
