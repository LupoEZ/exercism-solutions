class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberString = String.valueOf(numberToCheck);
        int numberOfDigits = numberString.length();
        char[] digits = numberString.toCharArray();
        int sum = 0;
        for (char digit : digits) {
            sum += (int) Math.pow(Character.getNumericValue(digit), numberOfDigits);
        }
        return sum == numberToCheck;
    }

}
