package AdapterPattern;

public class Adapter implements NewSystemInterface {
    private OldSystemInterface oldSystem;

    public Adapter(OldSystemInterface oldSystem) {
        this.oldSystem = oldSystem;
    }

    // Implementation of the new interface's method,
    // which simply calls the old interface's method
    public void retrieveData() {
        oldSystem.getData();
    }
}
