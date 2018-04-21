package tw.core;
import org.junit.Before;
import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    private RandomIntGenerator randomIntGenerator;

    @Before
    public void setUp() throws Exception {
        this.randomIntGenerator = new RandomIntGenerator();
    }

    @Test
    public void testGenerateNums() throws Exception {
        String Str = randomIntGenerator.generateNums(8, 4);

        assertThat(Str.length(), is(7));

    }

}