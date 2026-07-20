class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();

        int minfreq[] = new int[26];

        // Frequency of first word
        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            minfreq[ch - 'a']++;
        }

        // Compare with remaining words
        for (int i = 1; i < words.length; i++) {
            int freq[] = new int[26];

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                freq[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (freq[j] < minfreq[j]) {
                    minfreq[j] = freq[j];
                }
            }
        }

        // Build answer
        for (int i = 0; i < 26; i++) {
            while (minfreq[i] > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
                minfreq[i]--;
            }
        }

        return ans;
    }
}