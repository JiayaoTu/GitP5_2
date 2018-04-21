package tw.core;
import org.junit.Test;
import tw.validator.InputValidator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    @Test
    public void should_return_true_when_correct() throws Exception {
        InputValidator inputValidator = new InputValidator();
        String str = "1 2 3 4";

        Boolean isValidated = inputValidator.validate(str);

        assertThat(isValidated, is(true));
    }

    @Test
    public void should_return_false_when_error() throws Exception {
        InputValidator inputValidator = new InputValidator();
        String str = "1 2 3";

        Boolean isValidated = inputValidator.validate(str);

        assertThat(isValidated, is(false));
    }

}
