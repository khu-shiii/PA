
public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(1);
        
        System.out.println("Highest priority waiting:"+pq.peek());
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}