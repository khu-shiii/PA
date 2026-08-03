class Solution {
    public String[] sortPeople(String[] names, int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    String t=names[j];
                    names[j]=names[j+1];
                    names[j+1]=t;
                }
            }
        }
        return names;
    }
}

