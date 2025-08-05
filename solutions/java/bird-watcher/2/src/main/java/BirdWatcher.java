import java.util.Arrays;

class BirdWatcher {

    private final static int BUSY_THRESHOLD = 5;

    private final int[] birdsPerDay;
    private final int lastIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastIndex = birdsPerDay.length - 1;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return lastIndex > -1 ? birdsPerDay[lastIndex] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[lastIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(dayCount -> dayCount == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays
                .stream(
                        birdsPerDay,
                        0,
                        Math.min(birdsPerDay.length, numberOfDays))
                .sum();
    }

    public int getBusyDays() {
        return Arrays.stream(birdsPerDay).reduce(0, (counter, dayCount) -> counter += dayCount >= BUSY_THRESHOLD ? 1 : 0);
    }

}
