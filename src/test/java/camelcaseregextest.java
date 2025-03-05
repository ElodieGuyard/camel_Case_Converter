import org.junit.jupiter.api.Test;
import static com.example.CamelCaseConverterRegex.tocamelcaseregex;
import static org.junit.Assert.assertEquals;

public class camelcaseregextest {
    @Test
    void TestCamelCaseRegex() {
        assertEquals("helloWorld", tocamelcaseregex("hello_world"));
        assertEquals("helloWorld", tocamelcaseregex("hello-world"));
    }
}
