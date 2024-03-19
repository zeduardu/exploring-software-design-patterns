package FactoryPattern;

public final class DatabaseFactory {
    private DatabaseFactory() {}
    public static IDatabase produce(String type) {
        return switch (type) {
            case "postgresql" -> new PostgreSql("PostgreSql connectionstring");
            case "mysql" -> new MySql("MySql connectionstring");
            default -> throw new IllegalStateException("""
                    Not implemented type: '%s'""".formatted(type));
        };
    }
}
