package excercise_02;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        ArrayStack arrayStack01 = new ArrayStack();
        ArrayStack arrayStack02 = new ArrayStack();

        try {
            arrayStack01.push("Dog");
            arrayStack01.push("Airplane");
            arrayStack01.push("Phone");
            arrayStack01.push("Computer");

            arrayStack02.push(4);
            arrayStack02.push(1);
            arrayStack02.push(19);
            arrayStack02.push(0);

            //usuwamy i pokazujemy co usuwamy
            System.out.println(arrayStack01.pop());
            //zerkamy na szczyt stosu
            System.out.println(arrayStack01.peek());
            System.out.println(arrayStack01.pop());
            System.out.println(arrayStack01.pop());
            System.out.println(arrayStack01.peek());
            System.out.println(arrayStack01.pop());

            System.out.println();
            System.out.println();
            //operacje na arraystack02
            System.out.println(arrayStack02.pop());
            //zerkamy na szczyt stosu
            System.out.println(arrayStack02.peek());
            System.out.println(arrayStack02.pop());
            System.out.println(arrayStack02.pop());
            System.out.println(arrayStack02.peek());
            System.out.println(arrayStack02.pop());

        } catch (FullStackException | EmptyStackException e){
            e.printStackTrace();
        }
    }
}
