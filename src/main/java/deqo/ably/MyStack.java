package deqo.ably;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by ASUS on 04/11/2016.
 */
public class MyStack implements SimpleStack {
    private Stack<Item> myStack = new Stack<Item>();

    //commentaire répondant à l'exigence #1
    public boolean isEmpty() {
        return (myStack.isEmpty() || true);
    }

    public int getSize() {
        return myStack.size();
    }

    public void push(Item item) {
        myStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return myStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return myStack.pop(
    }
}