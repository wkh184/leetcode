class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null){
            return null;
        }
        HashMap<String, List<String>> map =  new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            // System.out.println("word = " + word);
            List<String> list;
            if(map.containsKey(word)){
                // List<String> list = map.get(word);
                // list.add(strs[i]);
                // map.put(word, list);
                list = map.get(word);
            }else{
                // List<String> list = new ArrayList();
                // list.add(strs[i]);
                // map.put(word, list);               
                list = new ArrayList();
            }
            list.add(strs[i]);
            map.put(word, list);               
        }
        List<List<String>> anagramGroup = new ArrayList();
        anagramGroup.addAll(map.values());
        // Iterator<List<String>> iterator = map.values().iterator();
        // while(iterator.hasNext()){
        //     anagramGroup.add(iterator.next());
        // }
        return anagramGroup;
    }
}