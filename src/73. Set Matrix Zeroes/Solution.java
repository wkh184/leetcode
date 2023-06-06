class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> cols = new ArrayList<Integer>(matrix[0].length);

        for(int row = 0; row < matrix.length; row++){
            boolean rowZero = false;
            for(int col = 0; col < matrix[0].length; col++){
                //row processing
                if(matrix[row][col] == 0){
                    if(!rowZero){
                        //first encounter of zero in row, set all previous row elements to 0
                        for(int i =0; i < col; i ++){
                            matrix[row][i] = 0;
                        }
                    }
                    rowZero = true;
                    //remember this col needs to be zero
                    if(!cols.contains(col)){
                        // if columns not zero column, add zero column and set all previous non-zero row and col to zero
                        cols.add(col);
                        for(int i =0; i < row; i ++){
                            matrix[i][col] = 0;
                        }
                    }
                }
                if(rowZero || cols.contains(col)){
                    //this is zero row or zero column, set all current element to 0
                    matrix[row][col] = 0;
                }
            }
        }

    }
}