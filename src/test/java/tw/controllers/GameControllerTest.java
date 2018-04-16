package tw.controllers;

import org.junit.*;
import static org.mockito.Mockito.*;
import tw.commands.InputCommand;
import tw.core.Game;


import static org.mockito.Mockito.mock;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

    private GameController gameController;
    private Game game;
    private InputCommand inputCommand;

    @Before
    public void setup() throws Exception
    {
        gameController=mock(GameController.class);
        game=mock(Game.class);
        inputCommand=mock(InputCommand.class);
    }

    @Test
    public void testWhenCheckCoutinueReturnTrue() throws Exception {
        when(game.checkCoutinue()).thenReturn(true);
        gameController.play(inputCommand);
        verify(gameController,times(1)).play(inputCommand);
    }
}