import me.sparker0i.arrays.PascalTriangle;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class PascalTriangleTest {
    PascalTriangle obj = new PascalTriangle();

    @Test @DisplayName("n = 5")
    public void n5() {
        int n = 5;
        int[][] expected = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 2, 1, 0, 0},
                {1, 3, 3, 1, 0},
                {1, 4, 6, 4, 1}
        };
        int[][] actual = obj.runner(n);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test @DisplayName("n = 1")
    public void n1() {
        int n = 1;
        int[][] expected = {
                {1}
        };
        int[][] actual = obj.runner(n);
        Assertions.assertArrayEquals(expected, actual);
    }
}
