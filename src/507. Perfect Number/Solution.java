class Solution {
    public boolean checkPerfectNumber(int num) {
        boolean perfectNumber = false;
        int remainder = num - 1;
        int highest = num;
        if(num > 1){
        for(int i = 2; i < num / 2; i++){
            if(i == highest){
                break;
            }
            if(num % i == 0){
                remainder -= i;
                int multiple = num / i;
                remainder -= multiple;
                if(multiple < highest){
                    highest = multiple;
                }
            }
            // System.out.println("i = " + i + " num / i = " + num / i + " remainder = " + remainder);
            if(remainder < 0 || i * i > num){
                break;
            }
        }
        if(remainder == 0){
            perfectNumber = true;
        }
        }
        return perfectNumber;
    }
}