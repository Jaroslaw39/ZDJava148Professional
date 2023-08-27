package excercise_02;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack();

        try {
            arrayStack.push("Dog");
            arrayStack.push("Airplane");
            arrayStack.push("Phone");
            arrayStack.push("Computer");

            //usuwamy i pokazujemy co usuwamy
            System.out.println(arrayStack.pop());
            //zerkamy na szczyt stosu
            System.out.println(arrayStack.peek());
            System.out.println(arrayStack.pop());
            System.out.println(arrayStack.pop());
            System.out.println(arrayStack.peek());
            System.out.println(arrayStack.pop());

        } catch (FullStackException | EmptyStackException e){
            e.printStackTrace();
        }
    }
}
