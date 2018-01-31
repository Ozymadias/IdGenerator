package generator;

public class SystemIdGenerator implements IdGenerator {
    public Long nextID() {
        return System.currentTimeMillis();
    }
}
