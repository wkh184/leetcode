class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascalTri = new ArrayList<List<Integer>>(numRows);
        List<Integer> row = new ArrayList<Integer>(1);
        row.add(1);
        pascalTri.add(row);
        for(int i = 1; i < numRows; i++){
            row = new ArrayList<Integer>(i+1);
            //first element is always 1
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(pascalTri.get(i - 1).get(j - 1) + pascalTri.get(i - 1).get(j));
            }
            //last element is always 1
            row.add(1);
            pascalTri.add(row);
        }
        return pascalTri;
    }
}