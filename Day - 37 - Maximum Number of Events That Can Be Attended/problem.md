# 1353. Maximum Number of Events That Can Be Attended
You are given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.

You can attend an event i at any day d where startTimei <= d <= endTimei. You can only attend one event at any time d.

Return the maximum number of events you can attend.

**Example 1:**
![e1](https://github.com/user-attachments/assets/7496f9a0-a49a-4853-b067-411b08284f34)
**Input:** events = [[1,2],[2,3],[3,4]] <br>
**Output:** 3<br>
**Explanation:** You can attend all the three events.<br>
One way to attend them all is as shown.<br>
Attend the first event on day 1.<br>
Attend the second event on day 2.<br>
Attend the third event on day 3.<br>

**Example 2:**

**Input:** events= [[1,2],[2,3],[3,4],[1,2]]<br>
**Output:** 4<br>
 

**Constraints:**

* 1 <= events.length <= 10⁵
* events[i].length == 2
* 1 <= startDayi <= endDayi <= 10⁵
