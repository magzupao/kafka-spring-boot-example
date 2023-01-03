package io.tpd.kafkaexample;

public class PracticalAdvice {
    private final String message;
    private final int identifier;

    public PracticalAdvice(String message, int identifier) {
        this.message = message;
        this.identifier = identifier;
    }

    public String getMessage() {
        return message;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "PracticalAdvice::toString() {" +
                "message='" + message + '\'' +
                ", identifier=" + identifier +
                '}';
    }
}