class NoOfOccurence{
	public static int fOccurrence(int[] arr,int target){
		int lo=0,hi=arr.length-1;
		int ans=1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				ans=mid;
				hi=mid-1;
				
			}
			else if(arr[mid]<target) lo=mid+1;
			else hi=mid-1;
		}
		return ans;
	}
	public static int lOccurrence(int[] arr,int target){
		int lo=0,hi=arr.length-1;
		int ans=1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				ans=mid;
				lo=mid+1;
				
			}
			else if(arr[mid]<target) lo=mid+1;
			else hi=mid-1;
		}
		return ans;
	}
	public static void main(String[] args){
		int[] arr={1,2,2,2,3,4,5};
		int target= 2;
		int first=fOccurrence(arr,target);
		int last=lOccurrence(arr,target);
		if(first==-1) System.out.print("Element not found");
		else System.out.print(last-first+1);
	}
}