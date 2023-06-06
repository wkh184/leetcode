class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //gradient = (y2 - y1) / (x2 - x1)
        int x = 0;
        int y = 1;

        boolean straight = true;
        boolean constantX = false;
        boolean constantY = false;
        int referenceX = 0;
        int referenceY = 0;
        double reference = 0;
        double gradient = 0;
        if(coordinates[1][x] > coordinates[0][x]){
            reference = (double)(coordinates[1][y] - coordinates[0][y]) / (double)(coordinates[1][x] - coordinates[0][x]);
        }else{
            reference = (double)(coordinates[0][y] - coordinates[1][y]) / (double)(coordinates[0][x] - coordinates[1][x]);
        }
        // System.out.println("reference = " + reference);
        if(reference == Double.POSITIVE_INFINITY || reference == Double.NEGATIVE_INFINITY){
            if(coordinates[1][y] == coordinates[0][y]){
                constantY = true;
                referenceY = coordinates[0][y];
            }
            if(coordinates[1][x] == coordinates[0][x]){
                constantX = true;
                referenceX = coordinates[0][x];
            }
            // System.out.println("constantY = " + constantY + " constantX = " + constantX);
        }
        for(int i = 1; i < coordinates.length - 1; i++){
            if(coordinates[i + 1][x] > coordinates[i][x]){
                gradient = (double)(coordinates[i + 1][y] - coordinates[i][y]) / (double)(coordinates[i + 1][x] - coordinates[i][x] );            
            }else{
                gradient = (double)(coordinates[i][y] - coordinates[i + 1][y]) / (double)(coordinates[i][x] - coordinates[i + 1][x] );            
            }
            // System.out.println("gradient = " + gradient);
            if(constantY){
                if(coordinates[i + 1][y] != referenceY){
                    straight = false;
                    break;
                }
            }else if(constantX){
                if(coordinates[i + 1][x] != referenceX){
                    straight = false;
                    break;
                }
            }else if(gradient != reference){
                straight = false;
                break;
            }
        }
        return straight;
    }
}