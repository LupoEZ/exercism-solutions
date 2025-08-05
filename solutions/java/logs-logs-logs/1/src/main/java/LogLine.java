import java.util.Map;

public class LogLine {

    private static final Map<String, LogLevel> logLevelAbbreviations = Map.ofEntries(
            Map.entry("TRC", LogLevel.TRACE),
            Map.entry("DBG", LogLevel.DEBUG),
            Map.entry("INF", LogLevel.INFO),
            Map.entry("WRN", LogLevel.WARNING),
            Map.entry("ERR", LogLevel.ERROR),
            Map.entry("FTL", LogLevel.FATAL)
    );

    private final String logAbbreviation;
    private final String logMessage;

    public LogLine(String logLine) {
        logAbbreviation = logLine.substring(1,4);
        logMessage = logLine.substring(7);
    }

    public LogLevel getLogLevel() {
        return logLevelAbbreviations.getOrDefault(logAbbreviation, LogLevel.UNKNOWN);
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncodedLogLevel() + ":" + logMessage;
    }

}
