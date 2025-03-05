import org.junit.jupiter.api.Test;

import static com.example.CamelCaseConverter.toCamelCase;
import static org.junit.Assert.assertEquals;

public class camelcasetest {
    @Test
    void testToCamelCase() {
        assertEquals("helloWorld", toCamelCase("hello_world"));
        assertEquals("javaIsCool", toCamelCase("java_is_cool"));
        assertEquals("", toCamelCase(""));
        assertEquals("YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields", toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }
}
