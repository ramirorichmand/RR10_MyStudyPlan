class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //helper functions contains
        //matrix of color
        //target index (i,j) which is sr and sc
        //target color which we will used to set the new color
        //the original color which we will use to check and change the color in all directions
        helper(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void helper(int image[][],int i,int j,int color,int num){
        //checking if the index i and j are pointing inside the matrix
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length){
            return ;
        }
        //checking if its not desired color which we not need to change
        //or checking if we already changed the element because its 
        //recursive solution we might see us in the same position again
        if(image[i][j] != num || image[i][j] == color){
            return ;
        }
        //set the new color
        image[i][j] = color;
        //traverse
        helper(image,i+1,j,color,num);//bottom
        helper(image,i-1,j,color,num);//top
        helper(image,i,j+1,color,num);//right
        helper(image,i,j-1,color,num);//left
    }
}