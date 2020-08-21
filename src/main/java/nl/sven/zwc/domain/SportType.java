package nl.sven.zwc.domain;

public enum SportType {
    BIKE("bike"),
    RUN("run"),
    SWIM("swim");

    private final String sport;

    private SportType(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return sport;
    }
}
