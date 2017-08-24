/**
 * Created by Chao on 2017/8/23.
 */
public class Level {
    private Spot[] spots;
    private int availableSpots;
    private static final int SPOTS_PER_LEVEL = 50;

    public Level() {
        this.spots = new Spot[SPOTS_PER_LEVEL];
        this.availableSpots = 50;
    }

    public boolean parkVehicle(Vehicle v) {
        if (availableSpots == 0) {
            return false;
        }
        for (Spot s : spots) {
            if (s.isAvailable()) {
                if (v.canFit(s)) {
                    s.parkVehicle(v);
                    v.parkIn(s);
                    availableSpots--;
                    return true;
                }
            }
        }
        return false;
    }

    public void spotFreed() {
        availableSpots++;
    }
}
