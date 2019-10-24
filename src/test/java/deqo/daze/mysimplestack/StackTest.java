package deqo.daze.mysimplestack;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class StackTest {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    Stack stack3 = new Stack();
    Item i1 = new Item(1);
    Item i2 = new Item(2);
    Item i3 = new Item(3);

    @Before
    public void setUp() {
        stack2 = new Stack();
        stack2.push(i1);
        stack2.push(i2);
        stack2.push(i3);
    }

    @Test
    public void isEmpty() {
        assertTrue("stack 1 est vide", stack1.isEmpty());
        assertFalse("stack 2 n'est pas vide", stack2.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals("stack2 taille 3", 3, stack2.getSize());
        assertEquals("stack1 taille 0", 0, stack1.getSize());
    }


    @Test(expected = EmptyStackException.class)
    public void pop() throws EmptyStackException {
        stack2.pop();
        assertEquals("stack 2 taille 3-1", 2, stack2.getSize());
        stack1.pop();

    }

    @Test(expected = EmptyStackException.class)
    public void peek() throws EmptyStackException {
        //assertEquals("stack 2 dernier = 3, prog renvoit "+stack2.peek(), 3, stack2.peek());
        stack1.peek();
    }

    @Test
    public void peek2NotEmpty() throws EmptyStackException {
        assertEquals("stack 2 dernier = 3, prog renvoit "+stack2.peek().getI(), 3, stack2.peek().getI());
    }

    @Test
    public void push() {
        stack1.push(i1);
        assertEquals("stack 1 taille = 1, prog renvoit "+stack1.getSize(), 1, stack1.getSize());

    }




}