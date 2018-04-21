package tw.core;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


import java.sql.Array;
import java.util.*;

import static org.mockito.Mockito.*;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    Answer answer;

    @Before
    public void setup() {
        answer = mock(Answer.class);
    }

    @Test
    public void testCreateAnswer() {
        //String []arr={"1","2","3","4"};
        //List<String> str=Arrays.asList(arr);;
        //answer.setNumList(str);
        String inputStr = "1 2 3 4";
        Answer res = answer.createAnswer(inputStr);
        int letter=res.getIndexOfNum("2");
        assertThat(String.valueOf(letter),is("1"));
    }
}