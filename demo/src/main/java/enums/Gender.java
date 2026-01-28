package enums;

public enum Gender {
    MALE("Masculino", 'M', 60),
    FEMALE("Feminino", 'F', 90);

    private final String description;
    private final char code;
    private final int minDaysBetweenDonations;

    Gender(String description, char code, int minDaysBetweenDonations) {
        this.description = description;
        this.code = code;
        this.minDaysBetweenDonations = minDaysBetweenDonations;
    }

    public String getDescription() { return description; }
    public char getCode() { return code; }
    public int getMinDaysBetweenDonations() { return minDaysBetweenDonations; }
}