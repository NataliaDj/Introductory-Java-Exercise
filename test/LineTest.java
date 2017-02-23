import org.junit.Test;
import shape.Line;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class LineTest {
    @Test
    public void horizontalLine0ReturnNewLineStringTest() {
        String line = Line.horizontalLine(0, '*');
        assertThat(line, is("\n"));
    }

    @Test
    public void horizontalLine1AsteriskReturn1AsteriskAndNewLineStringTest() {
        String line = Line.horizontalLine(1, '*');
        assertThat(line, is("*\n"));
    }

    @Test
    public void horizontalLine5AmpersandReturn5AmpersandAndNewLineStringTest() {
        String line = Line.horizontalLine(5, '&');
        assertThat(line, is("&&&&&\n"));
    }

    @Test
    public void verticalLine0ReturnEmptyStringTest() {
        String line = Line.verticalLine(0, '^');
        assertThat(line, is(""));
    }

    @Test
    public void verticalLine1AsterisksReturnAsterisksAndNewLineStringTest() {
        String line = Line.verticalLine(1, '*');
        assertThat(line, is("*\n"));
    }

    @Test
    public void verticalLine5HashReturnHashAndNewLine5TimesStringTest() {
        String line = Line.verticalLine(6, '#');
        assertThat(line, is("#\n#\n#\n#\n#\n#\n"));
    }
}
