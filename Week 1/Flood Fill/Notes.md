## Intuition
Note : After reading the intuition must read the example provided to understand the solution because words provided may be confusing.
We will be given a index of an matrix and what we need to do is just traverse in all direction from that particular given index and change all the image[i][j] colour to the given target colour having the colour same as the original colour of the given index.

Example 1: Given image with colour
````
[3,3,1,3,1,2]
[3,2,1,1,1,2]
[1,3,2,1,2,1]
[1,1,1,2,2,1]
````
so the given index is (2,3) and colour is 4
then index image[2][3] we have colour 1 then we will traverse in all the four direction and change the colour to 4 whose default colour is 1.
We will only traverse in top, bottom, right and left directions.
After the recursive traverse we got matrix as :
````
[3,3,4,3,4,2]
[3,2,4,4,4,2]
[1,3,2,4,2,1]
[1,1,1,2,2,1]
````
Note : You will not change all colour whose value is 1 we have only change the colour from the target index and there respective four directions.

## Complexity
Time complexity: O(n)
Space complexity: O(n)
