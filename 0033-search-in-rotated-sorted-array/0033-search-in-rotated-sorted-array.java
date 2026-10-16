class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int k =1;
        int i=0;
        int j=n-1;
    while(i<=j) {
        int mid = i+(j-i)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>=nums[i]){
            if(nums[i]<=target && target<=nums[mid]){
            j=mid-1;}
            else
            {
                i = mid+1;
            }
        }
        else if (nums[mid]<=nums[j]){
            if (nums[mid]<=target && target<=nums[j])
            {
            i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
    }  
    return -1;     
    }
}