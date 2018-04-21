package tw.core.generator;
import tw.core.generator.AnswerGenerator;
import org.junit.Before;
import org.junit.Test;
import tw.core.Answer;
import static org.mockito.Mockito.*;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {
    RandomIntGenerator randomIntGenerator;
    public  String RandomNumStr;
    AnswerGenerator answerGenerator;
    Answer answer;
    @Before
    public void setup() throws Exception
    {
        answerGenerator=mock(AnswerGenerator.class);
        randomIntGenerator=mock(RandomIntGenerator.class);
        RandomNumStr=randomIntGenerator.generateNums(9, 4);
    }

//    @Test
//    public void testGenerate() {
//        Answer answer = Answer.createAnswer(RandomNumStr);
      //  answer=answerGenerator.generate();

    //}
}

