package excercise_02;

import java.util.EmptyStackException;

public interface Stack<T> {

    void push(T object) throws FullStackException;
    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();


}
