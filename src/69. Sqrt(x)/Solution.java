class Solution {
    public int mySqrt(int x) {
        long sqrt = 0;
        if(x != 0){
            sqrt = 1;
            long low = 1;
            long high = x;
            long mid = 1;
            while(low <= high){
                mid = low + (high - low) / 2;
                long value = mid * mid;
                System.out.println("low = " + low + " high = " + high + " mid = " + mid + " value = " + value);
                if(value == x){
                    high = mid;
                    break;
                }else if(value > x){                   
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            sqrt = high;
        }
        return (int)sqrt;
    }
}