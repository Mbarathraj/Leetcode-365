class Solution {
    public int minimumDeletions(String word, int k) {
        int a[] = new int[26];
        int min = Integer.MAX_VALUE;

        for (char c : word.toCharArray()) {
            a[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] == 0) continue;
            int del = 0;
            for (int j = 0; j < 26; j++) {
                if (a[j] == 0) continue;
                int diff = Math.abs(a[j] - a[i]);
                if(a[j]<a[i]) del+=a[j];
                else if(diff>k) del+=diff-k;
            }
            min = Math.min(min, del);
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
