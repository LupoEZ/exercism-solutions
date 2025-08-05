public enum LogLevel {

    UNKNOWN("UNK",0),
    TRACE("TRC",1),
    DEBUG("DBG",2),
    INFO("INF",4),
    WARNING("WRN",5),
    ERROR("ERR",6),
    FATAL("FTL",42);

    private final String abbreviation;
    private final int encodedLogLevel;

    LogLevel(String abbreviation, int encodedLogLevel) {
        this.abbreviation = abbreviation;
        this.encodedLogLevel = encodedLogLevel;
    }

    public int getEncodedLogLevel() {
        return encodedLogLevel;
    }

    public static LogLevel checkAbbreviation(String abbreviation) {
        for (LogLevel logLevel : LogLevel.values()) {
            if (logLevel.abbreviation.equals(abbreviation)) return logLevel;
        }
        return UNKNOWN;
    }
}
