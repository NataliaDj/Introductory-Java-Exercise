package test;

import org.junit.Test;
import shape.Diamond;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class DiamondTest {
    @Test
    public void fullDiamondTest1() {
        String diamond = Diamond.createFullDiamond(0, '%');
        assertThat(diamond, is(""));
    }

    @Test
    public void fullDiamondTest2() {
        String diamond = Diamond.createFullDiamond(1, '$');
        assertThat(diamond, is("$\n"));

    }

    @Test
    public void fullDiamondTest3() {
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
    public void nameDiamondTest1() {
        String diamond = Diamond.createNameDiamond(0, "", '%');
        assertThat(diamond, is("\n"));

    }

    @Test
    public void nameDiamondTest2() {
        String diamond = Diamond.createNameDiamond(1, "Sam", '@');
        assertThat(diamond, is("Sam\n"));

    }

    @Test
    public void nameDiamondTest3() {
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
    public void diamondRowsTest1() {
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
    public void diamondRowsTest2() {
        String expected = "";
        String diamond = Diamond.createDiamondRows(0, 0,3, '#');
        assertThat(diamond, is(expected));

    }

    @Test
    public void diamondRowsTest3() {
        String expected = ""+
                "  a\n" +
                " aaa\n" +
                "aaaaa\n";
        String diamond = Diamond.createDiamondRows(1, 3,3, 'a');
        assertThat(diamond, is(expected));

    }

    @Test
    public void diamondRowsTest4() {
        String expected = "" +
                " @@@\n" +
                "  @\n";
        String diamond = Diamond.createDiamondRows(4, 5,3, '@');
        assertThat(diamond, is(expected));

    }

    @Test
    public void diamondRowsTest5() {
        String expected = "";
        String diamond = Diamond.createDiamondRows(5, 4,3, '!');
        assertThat(diamond, is(expected));

    }
}
