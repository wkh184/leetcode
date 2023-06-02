class ParkingSystem {
    private int[] lots;

    public ParkingSystem(int big, int medium, int small) {
        lots = new int[3];
        lots[0] = big;
        lots[1] = medium;
        lots[2] = small;
    }
    
    public boolean addCar(int carType) {
        boolean available = false;
        if(lots[carType - 1] > 0){
            lots[carType - 1]--;
            available = true;
        }
        // switch(carType){
        //     case 1:
        //         if(lots[0] > 0){
        //             available = true;
        //             lots[0]--;
        //         }
        //         break;

        //     case 2:
        //         if(lots[1] > 0){
        //             available = true;
        //             lots[1]--;
        //         }
        //         break;

        //     case 3:
        //         if(lots[2] > 0){
        //             available = true;
        //             lots[2]--;
        //         }
        //         break;
        // }
        return available;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */