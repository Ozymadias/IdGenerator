package generator;

public class AtomicIdGenerator implements IdGenerator {
    private static Long nextId = System.currentTimeMillis();

    public synchronized Long nextId() {
        return nextId++;
    }
}
