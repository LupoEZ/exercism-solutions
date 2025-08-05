class NeedForSpeed {

    private int speed;
    private int battery = 100;
    private int batteryDrain;
    private int distancedriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery <= 0 || battery < batteryDrain;
    }

    public int distanceDriven() {
        return distancedriven;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        distancedriven += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.getSpeed() * (100 / car.getBatteryDrain()) >= distance;
    }

}
