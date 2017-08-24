/**
 * Created by Chao on 2017/8/23.
 */
public class Motorcycle extends Vehicle {

    public Motorcycle() {
        size = VehicleSize.Small;
    }

    @Override
    protected boolean canFit(Spot spot) {
        VehicleSize size = spot.getSize();
        boolean result = false;
        switch (size) {
            case Small:
                result = true;
                break;
            case Standard:
                result = true;
                break;
            case Large:
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }
}
