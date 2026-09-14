class Sol{
	public static findMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]) max=arr[i];
            
            }
		return max;
        }

	public static void main(String[] args){
		
       int[] arr={10,30,20,40,90};
       
       int ans=findMax(arr);
       System.out.print(ans)

}
}