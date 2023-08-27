package excercise_02;

import java.util.EmptyStackException;

public interface Stack {

    void push(String object) throws FullStackException;
    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();


}
