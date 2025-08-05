class SqueakyClean {

    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean capitalFlag = false;

        for (char ch : identifier.toCharArray()) {
            if (ch == ' ') {
                sb.append('_');
            } else if (ch == '-') {
                capitalFlag = true;
            } else if (Character.isLetter(ch)) {
                if (capitalFlag) {
                    sb.append(Character.toUpperCase(ch));
                    capitalFlag = false;
                } else {
                    sb.append(ch);
                }
            } else if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        sb.append('a');
                        break;
                    case '3':
                        sb.append('e');
                        break;
                    case '0':
                        sb.append('o');
                        break;
                    case '1':
                        sb.append('l');
                        break;
                    case '7':
                        sb.append('t');
                        break;
                }
            }
        }
        return sb.toString();
    }

}

