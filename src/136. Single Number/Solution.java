class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> toMatch = new HashSet<Integer>(nums.length / 2);
        for(int i = 0; i < nums.length; i++){
            if(toMatch.contains(nums[i])){
                toMatch.remove(nums[i]);
            }else{
                toMatch.add(nums[i]);
            }
        }
        return toMatch.iterator().next().intValue();
    }
}