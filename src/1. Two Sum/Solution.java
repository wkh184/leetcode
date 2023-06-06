class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            int firstNum = nums[i];
            for(int j = 0; j < nums.length; j++){
                if( j != i){
                    int secondNum = nums[j];
                    if(firstNum + secondNum == target){
                        output[0] = j;
                        output[1] = i;
                        break;
                   }
                }
            }
        }
        return output;
    }
}