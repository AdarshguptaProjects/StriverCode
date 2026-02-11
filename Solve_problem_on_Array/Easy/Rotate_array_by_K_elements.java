class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        rev(nums,0, n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);
    }
    public void rev(int [] nums, int start, int last){
        while(start<last){
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last]  = temp;
            start++;
            last--;
        }
    }
}
