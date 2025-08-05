public class Lasagna {

    private static final int COOKING_TIME = 40;
    private static final int LAYER_PREP_TIME = 2;

    public int expectedMinutesInOven() {
        return COOKING_TIME;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return LAYER_PREP_TIME * layers;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return minutesInOven + preparationTimeInMinutes(layers);
    }
}
