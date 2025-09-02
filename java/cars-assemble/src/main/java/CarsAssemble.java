public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        final int CARS_PRODUCED_PER_HOUR = 221;

        int success_rate = 0;
        if (speed >= 1 && speed <=4) {
            success_rate = 100;
        } 
        else if (speed >= 5 && speed <= 8){
            success_rate = 90;
        }
        else if (speed == 9){
            success_rate = 80;
        }
        else if (speed == 10){
            success_rate = 77;
        }
        
        return (speed * CARS_PRODUCED_PER_HOUR) * ((double) success_rate / 100);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
