/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 *
 * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/
 *
 * algorithms
 * Medium (46.40%)
 * Total Accepted:    48.2K
 * Total Submissions: 104K
 * Testcase Example:  '"abpcplea"\n["ale","apple","monkey","plea"]'
 *
 * 
 * Given a string and a string dictionary, find the longest string in the
 * dictionary that can be formed by deleting some characters of the given
 * string. If there are more than one possible results, return the longest word
 * with the smallest lexicographical order. If there is no possible result,
 * return the empty string.
 * 
 * Example 1:
 * 
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * 
 * Output: 
 * "apple"
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * 
 * Output: 
 * "a"
 * 
 * 
 * 
 * Note:
 * 
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 * 
 * 
 */
class Solution {
    public String findLongestWord(String s, List<String> d) {
	    String longest = "";
	    for (String target : d) {
		    int l1 = longest.length();
		    int l2 = target.length();
		    if (l1 > l2 || (l1 == l2 && longest.compareTo(target) < 0)) {
			    continue;
		    }
		    if (isSubStr(s, target)) {
			    longest = target;
		    }
	    }


	    return longest;
        
    }

    private boolean isSubStr(String s, String target) {
	    int i = 0;
	    int j = 0;
	    while (i < s.length() && j < target.length()) {
		    if (s.charAt(i) == target.charAt(j)) {
			    j++;
		    }
	    	    i++;
	    }
	    return j == target.length();
    }
}
