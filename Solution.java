public class Solution{
	public static int maxSum(int[] arr,int k){
	int windowSum=0;
	for(int i=0;i<k ;i++){
		windowSum+=arr[i];
	}
	int maxSum=0;
	for(int i=k;i<arr.length;i++){
		windowSum+=arr[i];
		windowSum-=arr[i-k]
		maxSum=Math.max(windowSum,maxSum);
	}
	return maxSum;

	}

	public static void main(String[] args){
		int []arr={1,2,3,4,5};
		int k=3;
		maxSum(arr,k);

	}
}