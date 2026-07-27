// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
       int[] arr={10,30,20,40,90};
       int target=30;
       int ans=linearSearch(arr,target);
       if(ans==-1) System.out.print("Element not found");
       else System.out.print("Element found at index "+ans);
    }
}