/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 *
 * algorithms
 * Easy (73.08%)
 * Total Accepted:    103.4K
 * Total Submissions: 144.3K
 * Testcase Example:  '[-4,-1,0,3,10]'
 *
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 * 
 * 
 * 
 */
class Solution {
    public int[] sortedSquares(int[] A) {
      if (A == null) {
        return null;
      }
      int len = A.length;
      int[] ans = new int[len]; 
      int index = 0;
      int forward = 0;
      int back = 0;
      while (forward < len && A[forward] < 0) {
        forward++;
      }
      back = forward - 1;
      while (forward < len && back >= 0) {
        if (A[forward] * A[forward] < A[back] * A[back]) {
          ans[index++] = A[forward] * A[forward];
          forward++;
        } else {
          ans[index++] = A[back] * A[back];
          back--;
        }
      }
      while (forward < len) {
        ans[index++] = A[forward] * A[forward];
        forward++;
      }
      while (back >= 0) {
        ans[index++] = A[back] * A[back];
        back--;
      }
      return ans;
    }

      

}
