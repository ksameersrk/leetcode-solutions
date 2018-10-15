package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    private SpiralMatrix spiralMatrix;

    @Before
    public void setup() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    public void case1() {
        int matrix[][] = {
                new int[] {1,2,3},
                new int[] {4,5,6},
                new int[] {7,8,9}
        };
        List<Integer> actualOutput = spiralMatrix.spiralOrder(matrix);
        List<Integer> expectedOutput = Arrays.asList(new Integer[]{1,2,3,6,9,8,7,4,5});
        Assert.assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }

    @Test
    public void case2() {
        int matrix[][] = {
                new int[] {1, 2, 3, 4},
                new int[] {5, 6, 7, 8},
                new int[] {9,10,11,12}
        };
        List<Integer> actualOutput = spiralMatrix.spiralOrder(matrix);
        List<Integer> expectedOutput = Arrays.asList(new Integer[]{1,2,3,4,8,12,11,10,9,5,6,7});
        Assert.assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }
}
