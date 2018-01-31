package generator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class SystemIdGeneratorTest {
    private IdGenerator idGen = new SystemIdGenerator();

    @Test
    public void idsShouldBeUnique() {
        Long idA = idGen.nextId();
        Long idB = idGen.nextId();

        assertNotEquals(idA, idB, "idA " + idA + " idB " + idB);
    }
}