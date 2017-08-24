/**
 * Created by Chao on 2017/8/23.
 */
public class ParkingLot {
    private Level[] levels;
    private static final int LEVELS_PER_LOT = 5;

    public boolean parkVehicle(Vehicle v) {
        for (Level l : levels) {
            if (l.parkVehicle(v)) {
                return true;
            }
        }
        return false;
    }
}
