package deqo.daze.mysimplestack;

import java.util.ArrayList;
public class Stack implements SimpleStack {

    private ArrayList<Item> stack;


    public Stack() {
       this.stack = new ArrayList<Item>();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(stack.isEmpty()) throw  new EmptyStackException("Stack is empty");
        return stack.get(stack.size()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(stack.isEmpty()) throw  new EmptyStackException("Stack is empty");
        Item e = stack.get(stack.size()-1);
        stack.remove(stack.get(stack.size()-1));
        return e;
    }
}
