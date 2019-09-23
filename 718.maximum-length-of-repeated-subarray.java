/*
 * @lc app=leetcode id=718 lang=java
 *
 * [718] Maximum Length of Repeated Subarray
 *
 * https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
 *
 * algorithms
 * Medium (44.85%)
 * Total Accepted:    40K
 * Total Submissions: 84.8K
 * Testcase Example:  '[1,2,3,2,1]\n[3,2,1,4,7]'
 *
 * Given two integer arrays A and B, return the maximum length of an subarray
 * that appears in both arrays.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * Output: 3
 * Explanation: 
 * The repeated subarray with maximum length is [3, 2, 1].
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
 * 
 * 
 * 
 * 
 */
class Solution {
    public int findLength(int[] A, int[] B) {
      // dynamic programming
      // if a[i] = b[j]
      // dp[i][j] = dp[i-1][j-1] + 1;
      int longest = 0;
      int[][] dp = new int[A.length+1][B.length+1];
      for (int i = A.length-1; i >= 0; i--) {
        for (int j = B.length-1; j >= 0; j--) {
          if (A[i] == B[j]) {
            dp[i][j] = dp[i+1][j+1] + 1;
            if (dp[i][j] > longest) {
              longest = dp[i][j];
            }
          }
        }
      }
      return longest;
    
    

      
      
        
    }
}
