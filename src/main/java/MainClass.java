import AdapterPattern.Adapter;
import AdapterPattern.OldSystem;
import AdapterPattern.OldSystemInterface;
import FactoryPattern.*;
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Factory pattern: Database Factory");
        System.out.println("---");
        //
        var postgreSqlDb = DatabaseFactory.produce("postgresql");
        System.out.println("PostgreSql database: " + postgreSqlDb);
        postgreSqlDb.showConnectionString();
        System.out.println(" ");
        //
        var mySqlDb = DatabaseFactory.produce("mysql");
        System.out.println("MySql database: " + mySqlDb);
        mySqlDb.showConnectionString();

        System.out.println(" ");
        System.out.println("=======");
        System.out.println(" ");

        System.out.println("Adapter pattern: Adapter");
        System.out.println("---");
        OldSystem oldSystem = new OldSystem();
        Adapter adapter = new Adapter(oldSystem);
        adapter.retrieveData();
    }
}