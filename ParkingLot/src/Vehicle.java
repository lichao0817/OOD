/**
 * Created by Chao on 2017/8/23.
 */
public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleSize size;
    protected Spot spot;

    protected void parkIn(Spot spot) {
        this.spot = spot;
    }

    protected void clearSpot() {
        this.spot.clearSpot();
        this.spot = null;
    }

    protected abstract boolean canFit(Spot spot);
}
