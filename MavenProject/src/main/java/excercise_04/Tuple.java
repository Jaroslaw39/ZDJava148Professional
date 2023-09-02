package excercise_04;

public class Tuple <T>{
    private T right;
    private T left;

    public Tuple(T right, T left) {
        this.right = right;
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public T getLeft() {
        return left;
    }
}
