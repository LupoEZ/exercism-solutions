public class SalaryCalculator {

    private final static int DEFAULT_MULTIPLIER = 1;
    private final static double MULTIPLIER_PENALTY = 0.15;
    private final static int SKIPPED_DAYS_THRESHOLD = 5;
    private final static int DEFAULT_UNIT_MULTIPLIER = 10;
    private final static int BONUS_UNIT_MULTIPLIER = 13;
    private final static int BONUS_THRESHOLD = 20;
    private final static int BASE_SALARY = 1000;
    private final static int MAX_SALARY = 2000;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < SKIPPED_DAYS_THRESHOLD ? DEFAULT_MULTIPLIER : DEFAULT_MULTIPLIER * (1 - MULTIPLIER_PENALTY);
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < BONUS_THRESHOLD ? DEFAULT_UNIT_MULTIPLIER : BONUS_UNIT_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary <= MAX_SALARY ? salary : MAX_SALARY;
    }

}
