class Solution {
    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        boolean valid = true;
        boolean deleted = false;
        for(int left = 0; left < right; left++, right--){
            //check if left same as right
            if(s.charAt​(left) != s.charAt​(right)){
                //check whether deleted before
                if(!deleted){
                // if(s.charAt​(left) == s.charAt​(right - 1)){
                // //check if left equal right -1, if yes, delete right
                //     System.out.println("Delete right = " + right);
                //     deleted = true;
                //     right -= 1;
                // }else if(s.charAt​(left + 1) == s.charAt​(right)){
                // //check if left + 1 equal right, if yes, delete left
                //     System.out.println("Delete left = " + left);
                //     deleted = true;
                //     left += 1;
                // }else{
                // //deleting will not help
                // valid = false;
                // break;
                    valid = isValid(s, left, right - 1) || isValid(s, left + 1, right);
                    break;
                // }
                }else{
                //deleted before
                    // System.out.println("Deleted before left = " + left + " right = " + right);
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    boolean isValid(String s, int left, int right){
        // System.out.println("isValid left = " + left + " right = " + right);
        boolean valid = true;
        while(left < right){
            if(s.charAt​(left) == s.charAt​(right)){
                left++;
                right--;
            }else{
                valid = false;
                break;
            }
        }
        return valid;
    }
}
