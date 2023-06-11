class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] answer;
        List<int[]> tempAnswer = new ArrayList<>();
        //10000 from the problem's constraint
        int[] intervalEdges = new int[10000];
        int maxStartOfInterval = 0;
        for (int i = 0; i < intervals.length; i++) {
            int startOfInterval = intervals[i][0];
            int endOfInterval = intervals[i][1];
            // use Math.max for case [2,3][2,2][3,4] when you don't want override [2,3] with shorter [2,2].
            // add +1 for cases like this [0,0][1,1][2,2][3,3] and so far and so on.
            intervalEdges[startOfInterval] = Math.max(intervalEdges[startOfInterval], endOfInterval + 1);
        }
        int[] tempInterval = new int[]{-1, -1};
        for (int startOfCurrentInterval = 0; startOfCurrentInterval < intervalEdges.length; startOfCurrentInterval++) {
            int endOfTempInterval = tempInterval[1];
            int endOfCurrentInterval = intervalEdges[startOfCurrentInterval];
            if (endOfCurrentInterval != 0) {
                if (endOfTempInterval != -1) {
                    if (startOfCurrentInterval <= endOfTempInterval) {
                        // don't forget to do -1 since we've done +1 in the first loop
                        endOfTempInterval = Math.max(endOfTempInterval, endOfCurrentInterval - 1);
                        tempInterval[1] = endOfTempInterval;
                    } else {
                        tempAnswer.add(tempInterval);
                        // don't forget to do -1 since we've done +1 in the first loop
                        tempInterval = new int[]{
                                startOfCurrentInterval,
                                endOfCurrentInterval - 1
                        };
                    }
                } else {
                    tempInterval[0] = startOfCurrentInterval;
                    // don't forget to do -1 since we've done +1 in the first loop
                    tempInterval[1] = endOfCurrentInterval - 1;
                }
            }
        }
        int endOfTempInterval = tempInterval[1];
        if (endOfTempInterval != -1) {
            tempAnswer.add(tempInterval);
        }
        answer = new int[tempAnswer.size()][];
        for (int i = 0; i < tempAnswer.size(); i++) {
            answer[i] = tempAnswer.get(i);
        }
        return answer;
    }
}