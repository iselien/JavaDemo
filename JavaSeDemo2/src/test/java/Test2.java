import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Test2 {


    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            System.out.println("sdfwefe");
            Thread.sleep(3);
        });
    }

    @Test
    @Timeout(5)
    void setUp() {
        // fails if execution time exceeds 5 seconds
    }

}
