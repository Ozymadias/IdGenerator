package generator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AtomicIdGeneratorTest {
    private IdGenerator idGen = new AtomicIdGenerator();

    @Test
    public void idsShouldBeUnique() {
        Long idA = idGen.nextId();
        Long idB = idGen.nextId();

        assertNotEquals(idA, idB, "idA " + idA + " idB " + idB);
    }
}