package excercise_04;

public class Tuple <T extends Comparable<T>>{
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

    public T getMin(){
        if(right.compareTo(left) <= 0){
            return right;
        }else {
            return left;
        }
    }

    public T getMax(){
        if(right.compareTo(left)>=0){
            return right;
        }else {
            return left;
        }
    }
}
