# 2434. Using a Robot to Print the Lexicographically Smallest String

You are given a string s and a robot that currently holds an empty string t. Apply one of the following operations until s and t are both empty:

* Remove the first character of a string s and give it to the robot. The robot will append this character to the string t.
* Remove the last character of a string t and give it to the robot. The robot will write this character on paper.
Return the lexicographically smallest string that can be written on the paper. <br>

**Example 1:**

**Input:** s = "zza" <br>
**Output:** "azz"<br>
**Explanation:** Let p denote the written string.<br>
Initially p="", s="zza", t="".<br>
Perform first operation three times p="", s="", t="zza".<br>
Perform second operation three times p="azz", s="", t=""."<br>

**Example 2:**

**Input:** s = "bac"<br>
**Output:** "abc"<br>
**Explanation:** Let p denote the written string.<br>
Perform first operation twice p="", s="c", t="ba". <br>
Perform second operation twice p="ab", s="c", t="". <br>
Perform first operation p="ab", s="", t="c". <br>
Perform second operation p="abc", s="", t="".<br>

**Example 3:**

**Input:** s = "bdda"<br>
**Output:** "addb"<br>
**Explanation:** Let p denote the written string.<br>
Initially p="", s="bdda", t="".<br>
Perform first operation four times p="", s="", t="bdda".<br>
Perform second operation four times p="addb", s="", t="".<br>
 

**Constraints:**

* 1 <= s.length <= 105
* s consists of only English lowercase letters.
