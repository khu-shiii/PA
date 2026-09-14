
import java.util.*;
public class StackUsingArray{
    static class Stack{
       int[] arr;
       int top;
       Stack(int size){
        arr=new int[size];
        top=-1;
       } 
       void push(int value){
        if(top==arr.length-1){
            System.out.println("Stack OverFlow");
            return;
        }
        arr[++top]=value;
       }
        int pop(){
            if(top==-1){
                System.out.print("Stack UnderFlow");
                return -1;
            } 
            return arr[top--];

        }
        int peek(){
            if(top==-1){
                System.out.print("Stack underflow");
                return -1;
            }
            return arr[top];
        }
        void display(){
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Stack st=new Stack(5);
        st.push(10);

       
       
        st.push(20);
       
        st.push(30);
         st.display();
        System.out.print("Popped "+ st.pop());
         System.out.println();
        System.out.print("The top element is "+ st.peek());
         System.out.println();
        st.display();
    }

}
