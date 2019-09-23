/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.90%)
 * Total Accepted:    691.7K
 * Total Submissions: 1.9M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
      HashMap<Character, Character> paren = new HashMap<> ();
      Stack<Character> stack = new Stack<> ();
      paren.put('(', ')');
      paren.put('[', ']');
      paren.put('{', '}');
      int count = 0;
      int len = s.length();
      while (count < len) {
        char curr = s.charAt(count);
        if (curr == '(' || curr == '[' || curr == '{') {
          stack.push(curr);
        } else if (curr == ')' || curr == ']' || curr == '}') {
          if (stack.isEmpty()) {
            return false;
          }
          if (!paren.get(stack.pop()).equals(curr)) {
            return false;
          }
        }
        count++;
      }
      if (stack.isEmpty()) { 
        return true;
      } else {
        return false;
      }
    }
}
