import java.util.HashMap;
import java.util.Map;

public class CarsAssemble {

    private static final int BASE_RATE = 221;
    private static final int MINUTES_PER_HOUR = 60;

    private double successRate(int speed) {
        switch (speed) {
            case 0:
                return 0;
            case 1: case 2: case 3: case 4:
                return 1.0;
            case 5: case 6: case 7: case 8:
                return 0.9;
            case 9:
                return 0.8;
            default:
                return 0.77;
        }
    }

    public double productionRatePerHour(int speed) {
        return successRate(speed) * speed * BASE_RATE;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / MINUTES_PER_HOUR;
    }
}
