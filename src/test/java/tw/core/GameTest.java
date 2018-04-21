package tw.core;
import org.junit.Before;
import org.junit.Test;
import tw.core.generator.AnswerGenerator;
import tw.validator.InputValidator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {

    private Answer answer = Answer.createAnswer("1 2 3 4");
    private Game game;

    @Before
    public void setUp() throws Exception {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        game = new Game(answerGenerator);
    }

    @Test
    public void should_get_success_status_when_input_str_correct() throws Exception {


        game.guess(Answer.createAnswer("1 2 3 4"));

        String statusOfGame = game.checkStatus();
        assertThat(statusOfGame, is("success"));

    }

    @Test
    public void should_get_continue_status_when_input_str_incorrect() throws Exception {

        game.guess(Answer.createAnswer("1 2 4 3"));


        String statusOfGame = game.checkStatus();
        assertThat(statusOfGame, is("continue"));

    }

}
