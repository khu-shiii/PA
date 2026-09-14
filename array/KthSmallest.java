import java.util.*;
class KthSmallest{
	public static void SelectionSort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min=i;
		  for(int j=i+1;j<n;j++){
			if(arr[j]<arr[min]) min=j;	
		  }
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}

}
	public static void main(String[] args){
			int[] arr={9,4,7,1,5,2};
			int k=3;
			
                        SelectionSort(arr);
			System.out.print(Arrays.toString(arr));
                        System.out.println();
			System.out.println(k+"rd smallest element "+arr[k-1]);

		}
	}
