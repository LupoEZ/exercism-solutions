import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {

    static String clean(String identifier) {
        String task1 = identifier.replaceAll("\\s", "_");

        Matcher matcher = Pattern.compile("-(\\w)").matcher(task1);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(stringBuffer);
        String task2 = stringBuffer.toString();

        String task3 = task2.replaceAll("4", "a")
                            .replaceAll("3", "e")
                            .replaceAll("0", "o")
                            .replaceAll("1", "l")
                            .replaceAll("7", "t");

        String task4 = task3.replaceAll("[^a-zA-Z_]", "");

        return task4;
    }

}

