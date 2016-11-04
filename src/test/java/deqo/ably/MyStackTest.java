package deqo.ably;
import org.junit.Assert;
import org.junit.Assert.*;
import  org.junit.*;

/**
 * Created by ASUS on 03/11/2016.
 */
public class MyStackTest {
    MyStack stack ;
    @Before
    public void setUp() throws Exception {
        stack = new MyStack();
        System.out.println("creation de la pile");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true, stack.isEmpty());
        stack.push(new Item(3));
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, stack.getSize());
        stack.push(new Item(4));
        Assert.assertEquals(1, stack.getSize());
    }

    @Test
    public void push() throws Exception {
        Item item = new Item(14);
        Assert.assertEquals(0,stack.getSize());

        stack.push(item);
        stack.push(new Item(34));
        Assert.assertEquals(2,stack.getSize());

        Item item2 = stack.peek();
        Assert.assertEquals(2,stack.getSize());

        Item item3 = stack.pop();
        Assert.assertEquals(1,stack.getSize());
        Assert.assertEquals(item3.getValue(),item2.getValue());

        Assert.assertEquals(item2.getValue() instanceof Integer, true);
    }

    @Test
    public void peek() throws Exception {
        Item item = new Item(14);
        Assert.assertEquals(0,stack.getSize());

        stack.push(item);
        stack.push(new Item(34));
        Assert.assertEquals(2,stack.getSize());

        Item item2 = stack.peek();
        Assert.assertEquals(2,stack.getSize());

        Item item3 = stack.pop();
        Assert.assertEquals(1,stack.getSize());
        Assert.assertEquals(item3.getValue(),item2.getValue());

        Assert.assertEquals(item2.getValue() instanceof Integer, true);
    }

    @Test
    public void pop() throws Exception {
        Item item = new Item(14);
        Assert.assertEquals(0,stack.getSize());

        stack.push(item);
        stack.push(new Item(34));
        Assert.assertEquals(2,stack.getSize());

        Item item2 = stack.peek();
        Assert.assertEquals(2,stack.getSize());

        Item item3 = stack.pop();
        Assert.assertEquals(1,stack.getSize());
        Assert.assertEquals(item3.getValue(),item2.getValue());

        Assert.assertEquals(item2.getValue() instanceof Integer, true);
    }
}