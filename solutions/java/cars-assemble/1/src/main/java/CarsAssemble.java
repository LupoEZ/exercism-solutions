import java.util.HashMap;
import java.util.Map;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double factor = speed;
        if (speed < 1) {
            return 0;
        } else if (speed > 4 && speed <= 8) {
            factor *= 0.9;
        } else if (speed == 9) {
            factor *= 0.8;
        } else if (speed == 10) {
            factor *= 0.77;
        }
        return factor * 221;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
