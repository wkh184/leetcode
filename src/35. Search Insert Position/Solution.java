class Solution {
    public int searchInsert(int[] nums, int target) {
        int insertIndex = Arrays.binarySearch(nums, target);
        if(insertIndex < 0){
            int start = 0;
            int end = nums.length - 1;
            int mid = 0;

            while(start <= end){
                mid = start + (end - start) / 2;
                // System.out.println("start = " + start + " end = " + end  + " mid = " + mid);
                if(nums[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                insertIndex = start;
            }
        }
        return insertIndex;
    }
}