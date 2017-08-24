/**
 * Created by Chao on 2017/8/23.
 */
public class Spot {
    private VehicleSize size;
    private Vehicle vehicle;
    private Level level;

    public VehicleSize getSize() {
        return this.size;
    }

    public boolean parkVehicle(Vehicle v) {
        if (vehicle != null || !v.canFit(this)) {
            return false;
        }
        this.vehicle = v;
        v.parkIn(this);
        return true;
    }

    public void clearSpot() {
        this.vehicle = null;
        this.level.spotFreed();
    }

    public boolean isAvailable() {
        return vehicle == null;
    }
}
