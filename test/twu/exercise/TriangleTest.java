package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-30.
 */
public class TriangleTest {
    @Test
    public void should_draw_one_asterisk() throws Exception {
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.drawAsterisk());

    }

    @Test
    public void should_draw_a_horizontal_line() throws Exception {
        Triangle triangle = new Triangle();
        assertEquals("********", triangle.drawHorizontalLine(8));

    }
}
