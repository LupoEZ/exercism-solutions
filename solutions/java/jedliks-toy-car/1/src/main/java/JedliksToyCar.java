public class JedliksToyCar {

    private int metersDriven = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            metersDriven += 20;
            battery -= 1;
        }
    }
}
