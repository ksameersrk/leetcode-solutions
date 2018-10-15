package com.techmisal.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
*/

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if(matrix == null) return ans;
        int rowLength = matrix.length;
        if(rowLength > 0) {
            int colLength = matrix[0].length;
            int rowStart = 0;
            int colStart = 0;
            int rowEnd = rowLength - 1;
            int colEnd = colLength - 1;
            while(rowStart <= rowEnd && colStart <= colEnd) {
                for(int i=colStart; i<=colEnd; i++) {
                    ans.add(matrix[rowStart][i]);
                }
                rowStart++;
                for(int i=rowStart; i<=rowEnd; i++) {
                    ans.add(matrix[i][colEnd]);
                }
                colEnd--;
                if(rowStart <= rowEnd && colStart <= colEnd) {
                    for(int i=colEnd; i>=colStart; i--) {
                        ans.add(matrix[rowEnd][i]);
                    }
                    rowEnd--;
                    for(int i=rowEnd; i>=rowStart; i--) {
                        ans.add(matrix[i][colStart]);
                    }
                    colStart++;
                }
            }
        }
        return ans;
    }
}
