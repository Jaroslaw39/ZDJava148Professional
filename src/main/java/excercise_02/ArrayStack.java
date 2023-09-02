package excercise_02;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {

    private T[] stackData;
    private int buffor = 4;
    private int top = -1;

    public ArrayStack() {
        stackData = (T[]) new Object[buffor];
    }

    @Override
    public void push(T object) throws FullStackException {

        if(top >= stackData.length - 1){
            throw new FullStackException();
        }
        top++;
        stackData[top] = object;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        //usunięcie ostatniego elementu przez zmniejszenie wielkości tablicy
        return stackData[top--];
    }

    @Override
    public T peek() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        //metoda zwraca górę stosu, ale jej nie usuwa
        return stackData[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }


}
