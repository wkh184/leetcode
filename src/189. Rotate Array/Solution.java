class Solution {
    public void rotate(int[] nums, int k) {
        // brute force
        // for(int i = 0; i < k; i++){
        //     int end = nums[nums.length - 1];
        //     for(int j = nums.length - 1; j > 0; j--){
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = end;
        // }
        System.out.println("k = " + k + " nums.length = " + nums.length);
        if(nums.length == 1 || nums.length == k){
            return;
        }
        k = k % nums.length;
        System.out.println("New k = " + k + " nums.length = " + nums.length);
        int[] temp = new int[k + 1];
        int count = 0;
        int swapIndex = k;
        for(int i = nums.length - 1; count < k; i--){
            temp[count] = nums[i];
           
            if(swapIndex < 10){
                System.out.println("i = " + i + " count = " + (count) + " swapIndex = " + swapIndex);
                System.out.println("Swapping " + nums[i] + " with " + nums[swapIndex]);
            }
            // if(swapIndex < 0){
            //    System.out.println("Cyclic swapIndex = " + swapIndex);
            //    swapIndex = nums.length - 1;
            // }
            nums[i] = nums[swapIndex];
            count++;
            swapIndex--;
        }
        for(int i = nums.length - k; i > k; i--){
            // System.out.println("nums[k - i - 1] = " + (k - i - 1) + " temp[i] = " + temp[i]);
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++){
            // System.out.println("nums[k - i - 1] = " + (k - i - 1) + " temp[i] = " + temp[i]);
            nums[k - 1 - i] = temp[i];
        }
    }
}