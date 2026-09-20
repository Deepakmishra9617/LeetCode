class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int suffix =1;
        int [] prefix = new int [n];
       Arrays.fill(prefix,1);
        for (int i=0;i<n;i++){
            prefix[i] *=suffix;
            suffix *=nums[i];
        }
        suffix =1;
         for (int i=n-1;i>=0;i--){
            prefix[i] *=suffix;
            suffix *= nums[i];
         } 
         return prefix;
    }
}