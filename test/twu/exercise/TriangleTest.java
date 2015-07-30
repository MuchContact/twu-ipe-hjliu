package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-30.
 */
public class TriangleTest {

    private final Triangle triangle = new Triangle();

    @Test
    public void should_draw_one_asterisk() throws Exception {
        assertEquals("*", triangle.drawAsterisk());

    }

    @Test
    public void should_draw_a_horizontal_line() throws Exception {
        assertEquals("********", triangle.drawHorizontalLine(8));

    }

    @Test
    public void should_draw_a_vertical_line() throws Exception {
        assertEquals("*\n*\n*\n", triangle.drawVerticalLine(3));

    }
}
