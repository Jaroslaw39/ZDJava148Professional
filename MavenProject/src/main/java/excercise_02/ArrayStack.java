package excercise_02;

import java.util.EmptyStackException;

public class ArrayStack implements Stack {

    private String[] stackData;
    private int buffor = 4;
    private int top = -1;

    public ArrayStack() {
        stackData = new String[buffor];
    }

    @Override
    public void push(String object) throws FullStackException {

        if(top >= stackData.length - 1){
            throw new FullStackException();
        }
        top++;
        stackData[top] = object;
    }

    @Override
    public String pop() throws EmptyStackException {
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        //usunięcie ostatniego elementu przez zmniejszenie wielkości tablicy
        return stackData[top--];
    }

    @Override
    public String peek() throws EmptyStackException {
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
