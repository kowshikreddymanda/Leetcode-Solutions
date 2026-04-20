class Solution {
    public int maxDistance(int[] colors) {
        int maxDist = 0;
        int n = colors.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[i] != colors[j]) {
                    int currentDist = j - i;
                    if (currentDist > maxDist) {
                        maxDist = currentDist;
                    }
                }
            }
        }
        return maxDist;
    }
}