class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberString = String.valueOf(numberToCheck);
        int numberOfDigits = numberString.length();

        return numberToCheck == numberString
                .chars()
                .map(digit -> (int) Math.pow(Character.getNumericValue(digit), numberOfDigits))
                .sum();
    }

}
