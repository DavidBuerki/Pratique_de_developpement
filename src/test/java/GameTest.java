
import org.example.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GameTest {

    @Test
    @DisplayName("20 => 0")
    void score_Given20RollsAt0_shouldbe_0(){
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        int result = game.score();
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("20 => 20")
    void score_Given20RollsAt1_shouldbe_20(){
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        int result = game.score();
        Assertions.assertEquals(20,result);
    }
    @Test
    @DisplayName("5 + 5 + 3 => 16")
    void score_Given3RollsAt5And5And3_shouldbe_16(){
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        int result = game.score();
        Assertions.assertEquals(16,result);
    }

    @Test
    @DisplayName("10 + 3 + 4 => 24")
    void score_Given3RollsAt10And3And4_shouldbe_24(){
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(4);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        int result = game.score();
        Assertions.assertEquals(24,result);
    }

    @Test
    @DisplayName("12 rolls at 10 => 300")
    void score_Given12RollsAt10_shouldbe_300(){
        Game game = new Game();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        int result = game.score();
        Assertions.assertEquals(300,result);
    }








}

// Path: src/main/java/org/example/Game.ja
