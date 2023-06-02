class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree = new int[n];
        Iterator<List<Integer>> iterator = edges.iterator();
        while(iterator.hasNext()){
            List<Integer> vertex = iterator.next();
            indegree[vertex.get(1).intValue()]++;
        }
        // for(int i = 0; i < edges.size(); i++){
        //     indegree[edges.get(i).get(1).intValue()]++;
        // }
        List answer = new ArrayList();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                answer.add(i);
            }
        }
        return answer;
    }
}