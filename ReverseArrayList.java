import java.util.*;
public class ReverseArrayList{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Collections.reverse(list);
        System.out.print(list);
        System.out.println();
       System.out.print( Collections.max(list));
    }
}