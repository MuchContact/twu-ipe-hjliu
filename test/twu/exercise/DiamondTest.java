package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-30.
 */
public class DiamondTest {
    @Test
    public void should_draw_isosceles_triangle() throws Exception {
        Diamond diamond = new Diamond();
        String isoscelesTriangleGraph =
                "  */n" +
                " ***/n" +
                "*****/n";
        assertEquals(isoscelesTriangleGraph, diamond.drawIsoscelesTriangle(3));

    }

    @Test
    public void should_draw_diamond() throws Exception {
        Diamond diamond = new Diamond();
        String isoscelesTriangleGraph =
                "  */n" +
                " ***/n" +
                "*****/n" +
                " ***/n" +
                "  */n";
        assertEquals(isoscelesTriangleGraph, diamond.drawDiamond(3));

    }

    @Test
    public void should_draw_diamond_with_name_in_middle_line() throws Exception {
        Diamond diamond = new Diamond();
        String isoscelesTriangleGraph =
                "  */n" +
                " ***/n" +
                "Bill/n" +
                " ***/n" +
                "  */n";
        assertEquals(isoscelesTriangleGraph, diamond.drawDiamondWithName(3));
    }
}
