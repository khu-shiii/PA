import java.util.*;

class MovingAverage {

    Queue<Integer> q;
    int size;
    int sum;

    public MovingAverage(int size) {
        this.size = size;
        q = new LinkedList<>();
        sum = 0;
    }

    public double next(int val) {
        q.add(val);
        sum += val;

        if (q.size() > size) {
            sum -= q.poll();
        }

        return (double) sum / q.size();
    }

    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}