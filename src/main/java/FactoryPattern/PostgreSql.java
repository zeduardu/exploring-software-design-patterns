package FactoryPattern;

public class PostgreSql implements IDatabase {
    private final String connectionString;

    public PostgreSql(String type) {
        this.connectionString = type;
    }

    @Override
    public void showConnectionString() {
        System.out.printf("""
                PostgreSql DB, connectionString:'%s', showConnectionString method%n""", connectionString);
    }
}
