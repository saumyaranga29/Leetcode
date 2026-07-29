class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> answer = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end = Math.max(intervals[i][1],end);
            }
            else{
                answer.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        answer.add(new int[]{start,end});
        return answer.toArray(new int[answer.size()][]);
    }
}