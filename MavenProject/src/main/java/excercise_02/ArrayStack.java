package excercise_02;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {

    private String[] stackData;
    private int buffor = 10;
    private int top = 0;

    public ArrayStack() {
        stackData = new String[buffor];
    }

    @Override
    public void push(String object) throws FullStackException {


    }

    @Override
    public String pop() throws EmptyStackException {
        return null;
    }

    @Override
    public String peek() throws EmptyStackException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


}
