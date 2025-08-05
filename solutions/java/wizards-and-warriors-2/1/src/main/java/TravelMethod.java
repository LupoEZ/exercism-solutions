public enum TravelMethod {

    WALKING("by walking."),
    HORSEBACK("on horseback.");

    private final String description;


    TravelMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
