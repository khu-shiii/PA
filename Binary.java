class Binary{
	static int bs(int[] arr, int target){
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<target) lo=mid+1;
			else hi=mid-1;		
		}
		return -1;
}
	public static void main(String[] args){
		int[] arr={10,20,30,40,50,60,70};
		int target=40;
		int ans=bs(arr,target);
		if(ans==-1) System.out.print("element not found");
		else System.out.print("element found at index "+ans);

}
}