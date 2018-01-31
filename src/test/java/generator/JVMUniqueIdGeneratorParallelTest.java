package generator;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class JVMUniqueIdGeneratorParallelTest {
    private IdGenerator idGen = new AtomicIdGenerator();
    private Set<Long> ids = new HashSet<>(100);

    @Test(threadPoolSize = 7, invocationCount = 10000)
    public void idsShouldBeUnique() {
        assertTrue(ids.add(idGen.nextId()));
    }
}
