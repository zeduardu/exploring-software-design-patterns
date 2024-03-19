package AdapterPattern;

public class OldSystem implements OldSystemInterface {

    @Override
    public void getData() {
        System.out.println("Retrieving data from the old system...");
    }
}
