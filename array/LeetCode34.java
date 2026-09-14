class Solution {
    public int left(int[] arr, int target){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){ 
                ans=mid;
                hi=mid-1;
            }
            else if(arr[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return ans;

    }
    public int right(int[] arr, int target){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){ 
                ans=mid;
                lo=mid+1;
            }
            else if(arr[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=left(nums,target);
        arr[1]=right(nums,target);
        return arr;

    }
}