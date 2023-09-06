class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rw = matrix.length, cl = matrix[0].length;
        int left = 0, right = rw * cl-1;
        while(left <= right){
            int midPos =  left + (right - left)/2;
            int r = midPos / cl, c = midPos % cl;
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                left = midPos + 1;
            }else{
                right = midPos - 1;
            }
        }
        return false;
    }
}