/**
 * Created by Chao on 2017/8/23.
 */
public class Car extends Vehicle {
    public Car() {
        size = VehicleSize.Standard;
    }

    @Override
    protected boolean canFit(Spot spot) {
        VehicleSize size = spot.getSize();
        boolean result = false;
        switch (size) {
            case Small:
                result = false;
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
