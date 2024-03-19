package FactoryPattern;

public class MySql implements IDatabase{
    private final String connectionString;

    public MySql(String type) {
        this.connectionString = type;
    }

    @Override
    public void showConnectionString() {
        System.out.printf("""
                MySql DB, connectionstring:'%s', showConnectionString method%n""", connectionString);
    }
}
