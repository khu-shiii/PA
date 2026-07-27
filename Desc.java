import java.util.*;
class Desc{
public static void bubble(int[] arr){
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length-1-i;j++){
		if(arr[j]<arr[j+1]) {
  			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;

		}
	}
    }
}
public static void main(String[] args){
	int[] arr = {5, 3, 8, 4, 2};

        bubble(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
}
}