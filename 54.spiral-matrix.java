/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 *
 * https://leetcode.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (29.62%)
 * Total Accepted:    262.8K
 * Total Submissions: 839.1K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * Example 2:
 * 
 * Input:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      // brute force solution
      
      List ans = new ArrayList();
      // specail cases, if matrix is 0
      if (matrix.length == 0) {
        return ans;
      }
      // mark row and col
      int row = matrix.length;
      int col = matrix[0].length;
      // have a seen matric
      boolean[][] seen = new boolean[row][col];

      // have direction vectors
      int[] diRow = {0, 1, 0, -1};
      int[] diCol = {1, 0, -1, 0};

      // start point
      int rNow = 0, cNow = 0, d = 0;
      
      // start the process
      for (int i = 0; i < row * col; i++) {
        // add elemnt to ans array
        ans.add(matrix[rNow][cNow]);
        // makr as seen
        seen[rNow][cNow] = true;

        // one step forward
        int rNext = rNow + diRow[d];
        int cNext = cNow + diCol[d];

        // check whether in bound
        if (rNext >= 0 && rNext < row && cNext >= 0 && cNext < col && seen[rNext][cNext] == false) {
          // make next step the now step
          rNow = rNext;
          cNow = cNext;
        } else {
          // out of bounds, then try next direction
          d = (d + 1) % 4;
          rNow += diRow[d];
          cNow += diCol[d];
        }


      }
      return ans;
    }



}
