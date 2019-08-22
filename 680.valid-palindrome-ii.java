/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 *
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 *
 * algorithms
 * Easy (34.65%)
 * Total Accepted:    84.7K
 * Total Submissions: 244.4K
 * Testcase Example:  '"aba"'
 *
 * 
 * Given a non-empty string s, you may delete at most one character.  Judge
 * whether you can make it a palindrome.
 * 
 * 
 * Example 1:
 * 
 * Input: "aba"
 * Output: True
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 * 
 * 
 * 
 * Note:
 * 
 * The string will only contain lowercase characters a-z.
 * The maximum length of the string is 50000.
 * 
 * 
 */
class Solution {
    public boolean validPalindrome(String s) {
	    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
		    if (s.charAt(i) != s.charAt(j)) {
			    return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
		    }
	    }
	    return true;
        
    }

    private boolean isPalindrome(String s, int i, int j) {
	    while (i < j) {
		    if (s.charAt(i++) != s.charAt(j--)) {
			    return false;
		    }
	    }
	    return true;
    }
}
