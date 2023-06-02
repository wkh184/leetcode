import java.util.*;

class Solution {
     int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

   public boolean hasGroupsSizeX(int[] deck) {
        boolean possible = false;
        if(deck.length > 1){
            Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
            for(int i = 0; i < deck.length; i++){
                Integer number = Integer.valueOf(deck[i]);
                if(treeMap.get(number) != null){
                    treeMap.put(number, Integer.valueOf(treeMap.get(number).intValue() + 1));
                }else{
                    treeMap.put(number, new Integer(1));
                }
            }
            Collection<Integer> values = treeMap.values();
            Iterator<Integer> iterator = values.iterator();
            int commonFactor = iterator.next().intValue();
            while(iterator.hasNext()){
                Integer current = iterator.next();
                commonFactor = gcd(commonFactor, current.intValue());
                // System.out.println("commonFactor = " + commonFactor);
            }
            if(commonFactor > 1){
                possible = true;
            }
        }
        return possible;
   }
}