public class LogLine {

    private final String logAbbreviation;
    private final String logMessage;

    public LogLine(String logLine) {
        logAbbreviation = logLine.substring(
                logLine.indexOf('[') + 1,
                logLine.indexOf(']')
        );
        logMessage = logLine.substring(
                logLine.indexOf(':') + 2
        );
    }

    public LogLevel getLogLevel() {
        return LogLevel.checkAbbreviation(logAbbreviation);
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncodedLogLevel() + ":" + logMessage;
    }

}
