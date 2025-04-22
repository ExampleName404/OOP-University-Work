package Pr10;

public enum Permission {
    READ("Read access"),
    WRITE("Write access"),
    DELETE("Delete access"),
    BAN("Ban user");

    private final String description;

    Permission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}