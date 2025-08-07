import java.util.Arrays;

class ReverseString {

    String reverse(String inputString) {
        int inputLength = inputString.length();
        char[] inputCharArray = inputString.toCharArray();
        char[] reversedCharArray = new char[inputLength];
        for (int i=0; i < inputLength; i++) {
            reversedCharArray[i] = inputCharArray[inputLength - 1 - i];
        }
        return new String(reversedCharArray);
    }
  
}
