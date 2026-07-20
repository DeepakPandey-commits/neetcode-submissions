

class Solution {
    public List<String> mostVisitedPattern(String[] username,
                                           int[] timestamp,
                                           String[] website) {

        int n = username.length;

        // Sort by timestamp
        List<int[]> visits = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visits.add(new int[]{timestamp[i], i});
        }

        visits.sort((a, b) -> a[0] - b[0]);

        // User -> ordered websites
        Map<String, List<String>> userMap = new HashMap<>();

        for (int[] v : visits) {
            int idx = v[1];
            userMap
                .computeIfAbsent(username[idx], k -> new ArrayList<>())
                .add(website[idx]);
        }

        // Pattern -> score
        Map<String, Integer> count = new HashMap<>();

        for (String user : userMap.keySet()) {

            List<String> sites = userMap.get(user);
            Set<String> seen = new HashSet<>();

            int m = sites.size();

            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    for (int k = j + 1; k < m; k++) {

                        String pattern =
                                sites.get(i) + "," +
                                sites.get(j) + "," +
                                sites.get(k);

                        seen.add(pattern);
                    }
                }
            }

            for (String p : seen) {
                count.put(p, count.getOrDefault(p, 0) + 1);
            }
        }

        String answer = "";
        int maxScore = 0;

        for (String pattern : count.keySet()) {
            int score = count.get(pattern);

            if (score > maxScore ||
               (score == maxScore &&
                pattern.compareTo(answer) < 0)) {

                maxScore = score;
                answer = pattern;
            }
        }

        return Arrays.asList(answer.split(","));
    }
}