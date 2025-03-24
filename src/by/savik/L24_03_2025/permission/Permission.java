package by.savik.L24_03_2025.permission;

public enum Permission {
    READ("Чтение"),
    WRITE("Запись"),
    DELETE("Удаление"),
    EXECUTE("Выполнение");
    private final String description;


    Permission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
