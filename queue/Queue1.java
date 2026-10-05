class Queue{
    int[] arr;
    int front;
    int rear;
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int val){
        if(rear==size-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1) front=0;
        rear++;
        arr[rear]=val;
        System.out.println(val+ " inserted");
    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(arr[front]+ " Removed");
        front++;
    }
    void peek(){
       if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
         System.out.println("Front element: "+arr[front]);
    }
    void display(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

}
class Queue1{
    public static void main(String[] args){
        Queue q=new Queue(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.peek();

    }
}