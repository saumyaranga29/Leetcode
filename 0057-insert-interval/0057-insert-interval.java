class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int[][] arr = new int[intervals.length + 1][2];

        // Copy all intervals
        for (int i = 0; i < intervals.length; i++) {
            arr[i] = intervals[i];
        }

        // Add the new interval
        arr[intervals.length] = newInterval;

        // Sort according to start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Merge intervals
        List<int[]> answer = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] <= end) {

                end = Math.max(end, arr[i][1]);

            } else {

                answer.add(new int[]{start, end});

                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Add the last interval
        answer.add(new int[]{start, end});

        return answer.toArray(new int[answer.size()][]);
    }
}
        
  