class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        boolean can = true;
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        int duplicate = 0;
        for(int i = 0; i < arr.length; i++){
            if(!treeSet.contains(arr[i])){
                treeSet.add(arr[i]);
            }
        }
        if (treeSet.size() == 1){
            //all same number, return true
            can = true;
        }else if(treeSet.size() == arr.length){
            Iterator<Integer> iterator = treeSet.iterator();
            int first = iterator.next().intValue();
            int previous = iterator.next().intValue();
            int difference = previous - first;
            while(iterator.hasNext()){
                int nextInt = iterator.next().intValue();
                if(nextInt - previous != difference){
                    //differnce not match, means cannot
                    can = false;
                    break;
                } 
                previous = nextInt;
            }
        }else{
            //duplicate encountered, return false
            can = false;
        }
        return can;
    }
}