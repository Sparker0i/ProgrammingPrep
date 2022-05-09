import me.sparker0i.arrays.SetMatrixZero;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class SetMatrixZeroTest  {
    SetMatrixZero obj = new SetMatrixZero();

    @Test
    @DisplayName("n=3 positive test")
    public void matrixZeroTestPositive() {
        int[][] input = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] expected = {
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };

        int[][] actual = obj.runner(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Unequal n=3 test")
    public void matrixUnequalNTestPositive() {
        int[][] input = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int[][] expected = {
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        };

        int[][] actual = obj.runner(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}
