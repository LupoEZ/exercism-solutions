
class BirdWatcher {

    private final static int[] BIRDS_LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};
    private final static int BUSY_THRESHOLD = 5;

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return BIRDS_LAST_WEEK;
    }

    public int getToday() {
        return birdsPerDay[todayIndex()];
    }

    public void incrementTodaysCount() {
        birdsPerDay[todayIndex()]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count < 1) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i=0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int counter = 0;
        for (int count : birdsPerDay) {
            if (count >= BUSY_THRESHOLD) {
                counter++;
            }
        }
        return counter;
    }

    private int todayIndex() {
        return birdsPerDay.length - 1;
    }

}
