class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberString = String.valueOf(numberToCheck);
        int numberOfDigits = numberString.length();
        int sum = 0;
        for (char digit : numberString.toCharArray()) {
            sum += (int) Math.pow(Character.getNumericValue(digit), numberOfDigits);
        }
        return sum == numberToCheck;
    }

}
