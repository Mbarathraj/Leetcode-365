# 3442. Maximum Difference Between Even and Odd Frequency I

You are given a string s consisting of lowercase English letters.

Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:

* a1 has an odd frequency in the string.
* a2 has an even frequency in the string. <br>
Return this maximum difference.

**Example 1:**

**Input:** s = "aaaaabbc" <br>

**Output:** 3<br>

**Explanation:**

The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
The maximum difference is 5 - 2 = 3.<br>

**Example 2:**

**Input:** s = "abcabcab"<br>

**Output:** 1<br>

**Explanation:**

The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
The maximum difference is 3 - 2 = 1.<br>
 

**Constraints:**

* 3 <= s.length <= 100
* s consists only of lowercase English letters. 
* s contains at least one character with an odd frequency and one with an even frequency.
