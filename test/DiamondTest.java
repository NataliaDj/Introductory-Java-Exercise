import org.junit.Test;
import shape.Diamond;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class DiamondTest {
    @Test
    public void createFullDiamond0ShouldReturnEmptyStringTest() {
        String diamond = Diamond.createFullDiamond(0, '%');
        assertThat(diamond, is(""));
    }

    @Test
    public void createFullDiamond1ShouldReturnCharacterAndNewLineTest() {
        String diamond = Diamond.createFullDiamond(1, '$');
        assertThat(diamond, is("$\n"));

    }

    @Test
    public void createFullDiamond3ShouldReturn5LinesDiamondStringTest() {
        String expected =
                "  #\n" +
                " ###\n" +
                "#####\n" +
                " ###\n" +
                "  #\n";
        String diamond = Diamond.createFullDiamond(3, '#');
        assertThat(diamond, is(expected));

    }

    @Test
    public void createNameDiamond0ShouldReturnEmptyStringTest() {
        String diamond = Diamond.createNameDiamond(0, "", '%');
        assertThat(diamond, is("\n"));

    }

    @Test
    public void createNameDiamond1ShouldReturnNameAndNewLineTest() {
        String diamond = Diamond.createNameDiamond(1, "Sam", '@');
        assertThat(diamond, is("Sam\n"));

    }

    @Test
    public void createNameDiamond3ShouldReturn5LinesDiamondWithNameInMiddleTest() {
        String expected =
                "  !\n" +
                " !!!\n" +
                "Richard\n" +
                " !!!\n" +
                "  !\n";
        String diamond = Diamond.createNameDiamond(3, "Richard", '!');
        assertThat(diamond, is(expected));
    }

    @Test
    public void createDiamondRows1To5Size3ShouldReturnFull5LineDiamondStringTest() {
        String expected =
                "  !\n" +
                " !!!\n" +
                "!!!!!\n" +
                " !!!\n" +
                "  !\n";
        String diamond = Diamond.createDiamondRows(1, 5,3, '!');
        assertThat(diamond, is(expected));

    }

    @Test
    public void createDiamondRows0To0ShouldReturnEmptyStringTest() {
        String expected = "";
        String diamond = Diamond.createDiamondRows(0, 0,3, '#');
        assertThat(diamond, is(expected));

    }

    @Test
    public void createDiamondRows1To3Size3ShouldReturnHalfDiamondTest() {
        String expected = ""+
                "  a\n" +
                " aaa\n" +
                "aaaaa\n";
        String diamond = Diamond.createDiamondRows(1, 3,3, 'a');
        assertThat(diamond, is(expected));

    }

    @Test
    public void createDiamondRows4To5Size3ShouldReturnLowerHalfOfDiamondTest() {
        String expected = "" +
                " @@@\n" +
                "  @\n";
        String diamond = Diamond.createDiamondRows(4, 5,3, '@');
        assertThat(diamond, is(expected));

    }

    @Test
    public void createDiamondRows5To4ShouldReturnEmptyStringTest() {
        String expected = "";
        String diamond = Diamond.createDiamondRows(5, 4,3, '!');
        assertThat(diamond, is(expected));

    }
}
