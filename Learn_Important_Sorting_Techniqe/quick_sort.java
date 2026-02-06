class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        int pivit=arr[high];
        
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivit){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        
        return i+1;
    }
}
